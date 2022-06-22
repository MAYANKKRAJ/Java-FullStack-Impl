package com.mayank.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TeacherEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long teacherId;
	private String teacherName;
	
	@OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SubjectEntity> subject;

	public TeacherEntity() {}

	public TeacherEntity(Long teacherId, String teacherName, List<SubjectEntity> subject) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.subject = subject;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<SubjectEntity> getSubject() {
		return subject;
	}

	public void setSubject(List<SubjectEntity> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "TeacherEntity [teacherId=" + teacherId + ", teacherName=" + teacherName + ", subject=" + subject + "]";
	}

	
	

}
