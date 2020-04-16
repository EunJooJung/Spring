package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");

	Emp hong = (Emp) context.getBean("hong");
	Emp lee = context.getBean("lee", Emp.class);
	
	System.out.println(hong);
	System.out.println(lee);
}
	
}
