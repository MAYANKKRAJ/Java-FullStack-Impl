package com.mayank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.entity.TeacherEntity;
import com.mayank.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	
	@PostMapping("/")
	public ResponseEntity<TeacherEntity> saveTeacherDetails(@RequestBody TeacherEntity teacher){
		TeacherEntity teacherObject = this.teacherService.saveTeacherDetails(teacher);
		return ResponseEntity.ok().body(teacherObject);
	}

}
