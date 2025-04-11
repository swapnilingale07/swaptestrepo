package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee {

	private int eid;

	private String ename;

	private Address eaddress;

	public int getEid() {
		return eid;
	}

	public Address getEaddress() {
		return eaddress;
	}

	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * 
	 * System.out.println("Init method call!!!!");
	 * 
	 * }
	 * 
	 * @Override public void destroy() throws Exception { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 */

	@PostConstruct
	public void init() {
		System.out.println("Custome-Init method Call!!!");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy");
	}

}
