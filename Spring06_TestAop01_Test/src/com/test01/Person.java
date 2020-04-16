package com.test01;

public class Person implements Human {
	
	private String name;
	private String job;
	
	
	public Person() {
		
	}	

	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void sayName(String name) {
		
	}

	@Override
	public String sayJob(String job) {
		return "나의 직업은"+job+"입니다.";
	}

}
