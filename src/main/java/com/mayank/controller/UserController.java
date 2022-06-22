package com.mayank.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.entity.AddressEntity;
import com.mayank.entity.UserEntity;
import com.mayank.modelDto.UserModel;
import com.mayank.service.AddressServiceImpl;
import com.mayank.service.UserServiceImpl;

@RestController
@RequestMapping("/user/")
public class UserController {

	@Autowired
	private UserServiceImpl serviceImpl;

	@Autowired
	private AddressServiceImpl addressServiceImpl;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/save-details")
	public ResponseEntity<UserModel> saveUserDetails(@RequestBody UserEntity entity) {
		UserEntity saveUserDetails = this.serviceImpl.saveUserDetails(entity);
		UserModel userDto = modelMapper.map(saveUserDetails, UserModel.class);
		return ResponseEntity.ok().body(userDto);
	}

	@GetMapping("/all-users")
	public List<UserModel> findAllUsers() {
		List<UserModel> UserList = this.serviceImpl.findAllUsers().stream()
				.map(user -> modelMapper.map(user, UserModel.class)).collect(Collectors.toList());
		return UserList;
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<UserModel> findUserById(@PathVariable("id") Long id) {
		Optional<UserEntity> findUserById = this.serviceImpl.findUserById(id);
		UserEntity entity = findUserById.get();
		UserModel userModel = modelMapper.map(entity, UserModel.class);
		return ResponseEntity.ok().body(userModel);
	}

//	 Currently Fetching address only, need to fetch User Details as well
//	localhost:8080/user/city?city=Bhopal
	@GetMapping("/city")
	public ResponseEntity<List<UserModel>> findUserByCity(@RequestParam String city) {
		List<UserModel> userModelList = new ArrayList<UserModel>();
		List<AddressEntity> userByCityObject = this.addressServiceImpl.findUserByCity(city);
		for (AddressEntity add : userByCityObject) {
			UserModel map = modelMapper.map(add, UserModel.class);
			userModelList.add(map);
		}
		return ResponseEntity.ok().body(userModelList);
	}
	

	@GetMapping("/name/{name}")
	public ResponseEntity<List<UserModel>> findUserByName(@PathVariable String name) {

		List<UserModel> listOfUserModel = new ArrayList();

		List<UserEntity> userEntityObject = this.serviceImpl.findUserByName(name);

		for (UserEntity userEntity : userEntityObject) {
			UserModel map = modelMapper.map(userEntity, UserModel.class);
			listOfUserModel.add(map);
		}
		return ResponseEntity.ok().body(listOfUserModel);
	}
	

}
