package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		//Mtest클래스 main메서드안에서 banana beanxml 사용해서 sayHello()호출하자.
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		MessageBean bean = (MessageBean) factory.getBean("banana");
		bean.sayHello();
	
		MessageBean bean2 = (MessageBean) factory.getBean("mango");
		bean2.sayHello();
		
		MessageBean bean3 = (MessageBean) factory.getBean("grape");
		bean3.sayHello();
	}

}
