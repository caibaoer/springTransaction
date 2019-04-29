package com.huangpan_d.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

	@Override
	public void out(String outer, Integer money) {
		
		this.getJdbcTemplate().update("update account  set money=money-? where username=?" ,money,outer);
	}

	@Override
	public void in(String inner, Integer money) {
		this.getJdbcTemplate().update("update account  set money=money+? where username=?",money,inner);
		
	}


	

}
