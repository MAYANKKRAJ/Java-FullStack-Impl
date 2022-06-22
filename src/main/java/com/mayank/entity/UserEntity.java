package com.mayank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="user_details")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@Column(name = "user_name")
	private String name;
	
	private String lastName;
	
	@Column(name = "user_email")
	private String email;
	
	private String fatherName;
	private String 	motherName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "addressId")
	@JsonManagedReference
	private AddressEntity address;

	public UserEntity() {
		super();
	}

	public UserEntity(Long userId, String name, String lastName, String email, String fatherName, String motherName,
			AddressEntity address) {
		super();
		this.userId = userId;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

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

	public void setFatherName(String fathrName) {
		this.fatherName = fathrName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", name=" + name + ", lastName=" + lastName + ", email=" + email
				+ ", fathrName=" + fatherName + ", motherName=" + motherName + ", address=" + address + "]";
	}

	
	

}
