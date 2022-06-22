package com.mayank.service;

import java.util.List;
import java.util.Optional;

import com.mayank.entity.AddressEntity;
import com.mayank.entity.UserEntity;
import com.mayank.modelDto.UserModel;

public interface AddressService {
	
	public List<AddressEntity> findUserByCity(String city);
	
	

}
