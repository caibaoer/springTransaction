package com.huangpan_e.transaction;

public interface UserService {
	public void transfer(String outer, String inner, Integer money);
	//只对数据库操作一次，然后int i=9/0报错，看对数据库操作是否有效。-->结果：只要配置了事务，数据会回滚
	public void onlyOne();
}
