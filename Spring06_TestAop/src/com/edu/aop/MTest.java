package com.edu.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/edu/aop/applicationContext.xml");
		
		Shape rectangle = factory.getBean("rectangle", Shape.class);
		Shape triangle = factory.getBean("triangle", Shape.class);
		
		rectangle.viewSize();
		System.out.println("-----------");
		triangle.viewSize();
	
	}

}
