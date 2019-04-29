package com.huangpan_d.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		String xmlPath="com/huangpan_d/transaction/applicationContext.xml";
		ApplicationContext app=new ClassPathXmlApplicationContext(xmlPath);
		UserService accountService =  (UserService) app.getBean("userService");
		accountService.transfer("jack", "rose", 5000);
		

	}

}
