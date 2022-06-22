package com.mayank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayank.entity.UserEntity;
import com.mayank.repository.AddressRepository;
import com.mayank.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;
	


	// Saving User to DB
	@Override
	public UserEntity saveUserDetails(UserEntity userDetails) {		
		return this.repo.save(userDetails);
	}	
	
	// Find all users
	@Override
	public List<UserEntity> findAllUsers() {
		List<UserEntity> entities = new ArrayList<UserEntity>();
		return repo.findAll();
	}
	
	@Override
	public Optional<UserEntity> findUserById(Long userid) {
		Optional<UserEntity> findById = this.repo.findById(userid);
		UserEntity userEntity = findById.get();
		if(userEntity!=null) {
//			return Optional.of(userEntity);
			return Optional.ofNullable(userEntity);
		}
		return Optional.empty();
	}


	@Override
	public UserEntity findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> findUserByName(String name) {
		List<UserEntity> byName = this.repo.findByName(name);
		return byName;
	}


	/* Searching Operations Ends here*/

}
