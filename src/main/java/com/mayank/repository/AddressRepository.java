package com.mayank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.mayank.entity.AddressEntity;
import com.mayank.entity.UserEntity;
import com.mayank.modelDto.UserModel;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

	@Query(value="select * from address_entity  where city=?", nativeQuery = true)
	List<AddressEntity> findByCity(@RequestParam String city);
	
	
//	@Query(value = "SELECT * FROM address_entity where city= :city", nativeQuery = true)
//	List<UserEntity> findByCity(String city);
	
//	@Query("select u from address_etity u where u.city =:c")
//	List<UserEntity> findByCity(@Param("c") String city);

}
