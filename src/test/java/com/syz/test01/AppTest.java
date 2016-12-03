package com.syz.test01;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class AppTest{
	@Autowired
	public App app ;

	public App getApp() {
		return app;
	}
	public void setApp(App app) {
		this.app = app;
	}
	@Test
	public void testIOC() {
		System.out.println(app);
		System.out.println(app.getPerson().getName());
	}
}
