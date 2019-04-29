package com.huangpan_f.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		String xmlPath="com/huangpan_f/transaction/applicationContext.xml";
		ApplicationContext app=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService =  (UserService) app.getBean("userService");
		userService.transfer("jack", "rose", 5000);
	}

	/**
	 * 个人理解：要给一个方法加事务，那么这个方法里面至少要有2个或者2个以上对数据库操作的动作。
	 * 一个对数据库的操作也可以，因为在操作数据库之前，会有一个savePoint,之后出现异常，直接回滚到该savePoint.
	 */
	
}
