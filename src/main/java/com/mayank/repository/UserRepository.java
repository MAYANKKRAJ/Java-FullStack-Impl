package com.mayank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.mayank.entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	@Query(value = "SELECT * FROM user_details where user_name= :name", nativeQuery = true)
	List<UserEntity> findByName(String name);
	
//	@Query("select u from user_details u where u.user_name=:n")
//	List<UserEntity> findByName(@Param("n") String user_name);
	
//	@Query(value = "select p.* from user_details p where user_name = :user_name", nativeQuery = true)
//	List<UserEntity> findByName(String user_name);
}
