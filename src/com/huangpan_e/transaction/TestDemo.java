package com.huangpan_e.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		String xmlPath="com/huangpan_e/transaction/applicationContext.xml";
		ApplicationContext app=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService =  (UserService) app.getBean("userService");
		userService.transfer("jack", "rose", 5000);
	}

	/**
	 * 个人理解：要给一个方法加事务，那么这个方法里面至少要有2个或者2个以上对数据库操作的动作。
	 * 一个？
	 */
	@Test
	public void t() {
		String xmlPath="com/huangpan_e/transaction/applicationContext.xml";
		ApplicationContext app=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService =  (UserService) app.getBean("userService");
		userService.onlyOne();
	}
}
