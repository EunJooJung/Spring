package com.test04;

import org.springframework.stereotype.Component;

@Component
public class Man implements Person {

	@Override
	public String classWork() {
		String s = null;
		s.length();
		
		
		System.out.println("컴퓨터를 켜서 게임한다.");
		
		return "롤";
	}

}
