package com.mayank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayank.entity.AddressEntity;
import com.mayank.entity.UserEntity;
import com.mayank.modelDto.UserModel;
import com.mayank.repository.AddressRepository;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addressRepository;
	

	@Override
	public List<AddressEntity> findUserByCity(String city) {
		 List<AddressEntity> cityRecords = this.addressRepository.findByCity(city);		 
		return cityRecords;
	}
	

}
