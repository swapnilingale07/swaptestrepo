package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HomeController {

	public static void main(String[] args) {

		ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = apc.getBean("employee", Employee.class);

		System.out.println(emp);
	}
}
