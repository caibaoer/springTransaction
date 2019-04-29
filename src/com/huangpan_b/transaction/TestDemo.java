package com.huangpan_b.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {	                   
		String xmlPath="com/huangpan_b/transaction/applicationContext.xml";
		ApplicationContext app=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService =(UserService)app.getBean("userService");
		userService.transfer("jack", "rose", 5000);
		

	}

}
