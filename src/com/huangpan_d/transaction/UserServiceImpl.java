package com.huangpan_d.transaction;

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
		//int i = 1 / 0;
		userDao.in(inner, money);
		
		
	}

}
