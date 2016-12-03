package com.syz.test01;

import org.springframework.stereotype.Component;

@Component
public class Person {
	public String name = "zhangsan";

	public String age = "1";

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getAge() {

		return age;

	}

	public void setAge(String age) {

		this.age = age;

	}
}
