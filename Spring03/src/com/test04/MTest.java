package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test03.Emp;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		Developer hong = (Developer) factory.getBean("honggd");
		Engineer lee = factory.getBean("leess", Engineer.class);
		
		System.out.println(hong);
		System.out.println(lee);
		
	}

}
