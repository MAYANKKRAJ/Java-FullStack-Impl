package com.mayank.service;

import java.util.List;

import com.mayank.entity.TeacherEntity;

public interface TeacherService {
	
	public List<TeacherEntity> findAllTeacher();
	
	public TeacherEntity saveTeacherDetails(TeacherEntity teacher);

}
