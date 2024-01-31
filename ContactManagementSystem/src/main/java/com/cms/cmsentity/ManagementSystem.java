package com.cms.cmsentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="contactmanagement")
public class ManagementSystem {
	private String name;
	private String address;
	private int phoneNumber;
	private String emailId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public ManagementSystem(String name, String address, int phoneNumber, String emailId) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public ManagementSystem() {
		super();
	}

}
