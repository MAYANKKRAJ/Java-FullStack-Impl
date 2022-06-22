package com.mayank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class SubjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;
	private String bookName;
	private String authorName;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "tchr_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private TeacherEntity teacher;

	public SubjectEntity() {}

	public SubjectEntity(Long bookId, String bookName, String authorName, TeacherEntity teacher) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.teacher = teacher;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public TeacherEntity getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherEntity teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "SubjectEntity [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", teacher=" + teacher + "]";
	}


}
