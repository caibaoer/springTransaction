package com.huangpan_f.transaction;

import org.springframework.transaction.annotation.Transactional;

public interface UserDao {
	
	public void out(String outer, Integer money);

	public void in(String inner, Integer money);
	//只对数据库操作一次，然后int i=9/0报错，看对数据库操作是否有效。-->结果：只要配置了事务，数据会回滚
	public void onlyOne();
}
