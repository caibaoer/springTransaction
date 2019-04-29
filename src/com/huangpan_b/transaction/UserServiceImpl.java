package com.huangpan_b.transaction;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class UserServiceImpl  implements UserService{
	
	private TransactionTemplate transactionTemplate;
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
	public void transfer( final String outer, final String inner, final Integer money) {
	/*	userDao.out(outer, money);
		userDao.in(inner, money);*/
			transactionTemplate.execute(new TransactionCallbackWithoutResult() {			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				userDao.out(outer, money);
				userDao.in(inner, money);
			}
		});
		
	}

}
