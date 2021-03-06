package com.cts.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
	@Id
	@GeneratedValue
	private int sid;
	@Column(name="student_name")
	private String studentName;
	private String department;
	private String email;
	@Column(name="mobile_number")
	private Long mobileNumber;
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentEntity(String studentName, String department, String email, Long mobileNumber) {
		super();
		this.studentName = studentName;
		this.department = department;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public StudentEntity(int sid, String studentName, String department, String email, Long mobileNumber) {
		super();
		this.sid = sid;
		this.studentName = studentName;
		this.department = department;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
