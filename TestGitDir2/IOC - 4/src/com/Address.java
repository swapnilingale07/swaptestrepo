package com;

public class Address {

	private int pincode;

	private String country;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", country=" + country + "]";
	}

}
