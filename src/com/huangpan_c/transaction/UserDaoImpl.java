package com.huangpan_c.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

	@Transactional(readOnly=true)
	@Override
	public void out(String outer, Integer money) {
		this.getJdbcTemplate().update("update account  set money=money-? where username=?" ,money,outer);
	}
	@Transactional(readOnly=true)
	@Override
	public void in(String inner, Integer money) {
		this.getJdbcTemplate().update("update account  set money=money+? where username=?",money,inner);
		
	}


	

}
