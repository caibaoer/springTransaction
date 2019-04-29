package com.huangpan_f.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
	//@Transactional(readOnly=true)
	@Override
	public void out(String outer, Integer money) {
		
		this.getJdbcTemplate().update("update account  set money=money-? where username=?" ,money,outer);
	}
	//@Transactional(readOnly=true)
	@Override
	public void in(String inner, Integer money) {
		this.getJdbcTemplate().update("update account  set money=money+? where username=?",money,inner);
		
	}
	//只对数据库操作一次，然后int i=9/0报错，看对数据库操作是否有效-->结果：只要配置了事务，数据会回滚
	@Override
	public void onlyOne() {
		this.getJdbcTemplate().update("update account set money=14000 where username='huangpan'");
		//int i=9/0;
		System.out.println("test over...");
		
	}


	

}
