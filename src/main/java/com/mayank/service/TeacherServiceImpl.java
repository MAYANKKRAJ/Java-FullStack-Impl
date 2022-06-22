package com.mayank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayank.entity.TeacherEntity;
import com.mayank.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public List<TeacherEntity> findAllTeacher() {
		
		return null;
	}

	@Override
	public TeacherEntity saveTeacherDetails(TeacherEntity teacher) {
		TeacherEntity teacherEntity = this.teacherRepository.save(teacher);
		return teacherEntity;
	}

}
