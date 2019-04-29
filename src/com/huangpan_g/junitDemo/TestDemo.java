package com.huangpan_g.junitDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/huangpan_g/junitDemo/applicationContext.xml")
public class TestDemo {
	@Autowired  //与junit整合，不需要在spring xml配置扫描
	private UserService userService; 
	
	@Test
	public void test01() {
		/**
		 String xmlPath="com/huangpan_f/transaction/applicationContext.xml";
		 ApplicationContext app=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService =  (UserService) app.getBean("userService");
		userService.transfer("jack", "rose", 5000);
		 */
		
		userService.transfer("jack", "rose", 5000);
		
		
	}
	
}
