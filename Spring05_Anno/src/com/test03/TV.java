package com.test03;

import org.springframework.stereotype.Component;

@Component
public interface TV {

	void powerOn();
	void powerOff();
	void volumeUp();
	void volumeDown();
	
}
