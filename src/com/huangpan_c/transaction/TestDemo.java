package com.huangpan_c.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		String xmlPath="com/huangpan_c/transaction/applicationContext.xml";
		ApplicationContext app=new ClassPathXmlApplicationContext(xmlPath);
		UserService accountService =  (UserService) app.getBean("proxyUserService");
		accountService.transfer("jack", "rose", 5000);
		

	}

}
