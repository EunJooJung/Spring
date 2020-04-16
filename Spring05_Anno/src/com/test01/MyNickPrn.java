package com.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyNickPrn {
//@Component <bean id="myNickPrn" class=""/>
	
	@Autowired //애랑 같은 타입의 객체를 찾아서 넣어준다.
	private Nickname nickname;

	public Nickname getNickname() {
		return nickname;
	}

	public void setNickname(Nickname nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "내 별명은 " + nickname + "입니다";
	}
	
	

}
