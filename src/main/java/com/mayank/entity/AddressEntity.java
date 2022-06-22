package com.mayank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;	
	private String houseNo;
	private String street;
	 //@JsonProperty(access = JsonProperty.Access.READ_ONLY) // it will Read The default data from Db BUT cAN'T UPDATE NEW DATA  IN db.
	private String landMark;
	private String city;
	// @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) // it will write in Db BUT CAN'T FETCH THIS PROPERTY from DB.
	private String country;
	
	@OneToOne(mappedBy = "address", cascade=CascadeType.ALL, optional = false)
	@JsonBackReference
	private UserEntity userEntity;
	
	public AddressEntity() {
		super();
	}

	public AddressEntity(Long addressId, String houseNo, String street, String landMark, String city, String country,
			UserEntity userEntity) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.street = street;
		this.landMark = landMark;
		this.city = city;
		this.country = country;
		this.userEntity = userEntity;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	@Override
	public String toString() {
		return "AddressEntity [addressId=" + addressId + ", houseNo=" + houseNo + ", street=" + street + ", landMark="
				+ landMark + ", city=" + city + ", country=" + country + ", userEntity=" + userEntity + "]";
	}
	
	

	
	

}
