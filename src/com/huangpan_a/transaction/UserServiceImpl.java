package com.huangpan_a.transaction;

public class UserServiceImpl  implements UserService{
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void transfer(String outer, String inner, Integer money) {
		userDao.out(outer, money);
		int i=9/0;
		userDao.in(inner, money);
		
	}

}
