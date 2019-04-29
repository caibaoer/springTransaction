package com.huangpan_e.transaction;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class UserServiceImpl  implements UserService{
	
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public void transfer(String outer, String inner, Integer money) {
		userDao.out(outer, money);
		userDao.in(inner, money);	
	}

	//只对数据库操作一次，然后int i=9/0报错，看对数据库操作是否有效。-->结果：只要配置了事务，数据会回滚
	@Override
	public void onlyOne() {
		userDao.onlyOne();
		
	}

}
