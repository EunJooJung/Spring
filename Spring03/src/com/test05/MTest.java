package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test05.Engineer;

public class MTest {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
	
	Developer hong = (Developer) context.getBean("honggd");
	Engineer lee = (Engineer) context.getBean("leess");
	
	System.out.println(hong);
	System.out.println(lee);
	}
}
