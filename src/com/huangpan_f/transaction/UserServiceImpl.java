package com.huangpan_f.transaction;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl  implements UserService{
	
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	//导致@Transactional失效有俩个原因，
	//原因1、@Transactional只能应用在public方法才有效
	//原因2、 @Transactional不能作用在方法的内部的任何方法上
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	@Override
	public void transfer(String outer, String inner, Integer money) {
		userDao.out(outer, money);
		//int a=1/0;
		userDao.in(inner, money);	
	}

	//只对数据库操作一次，然后int i=9/0报错，看对数据库操作是否有效。-->结果：只要配置了事务，数据会回滚
	@Override
	public void onlyOne() {
		userDao.onlyOne();
		
	}

}
