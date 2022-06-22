package com.mayank.service;

import java.util.List;
import java.util.Optional;

import com.mayank.entity.UserEntity;

public interface UserService {
	
	public UserEntity saveUserDetails(UserEntity userDetails);
	
	public List<UserEntity> findAllUsers();
	
	public Optional<UserEntity> findUserById(Long userid);
	
	public UserEntity findUserByEmail(String email);
	
	public List<UserEntity> findUserByName(String user_name);
	

}
