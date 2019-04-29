package com.huangpan_b.transaction;

public interface UserDao {
	public void out(String outer, Integer money);
	public void in(String inner, Integer money);
}
