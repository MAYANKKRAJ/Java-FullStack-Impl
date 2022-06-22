package com.mayank.modelDto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.mayank.entity.AddressEntity;

public class UserModel {
	
    private String name;	
	private String lastName;
	private String email;	
	private String fatherName;
	//private String 	motherName;
	private AddressEntity address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public AddressEntity getAddress() {
		return address;
	}
	public void setAddress(AddressEntity address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserModel [name=" + name + ", lastName=" + lastName + ", email=" + email + ", fatherName=" + fatherName
				+ ", address=" + address + "]";
	}

	
}
