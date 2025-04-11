package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "add")
	public Address getAdd() {
		Address ad = new Address();
		ad.setCountry("INDIA");
		ad.setPincode(5645451);
		return ad;
	}

	@Bean(name = "employee")
	public Employee getEmp() {
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Raju");
		emp.setEaddress(getAdd());

		return emp;
	}

}
