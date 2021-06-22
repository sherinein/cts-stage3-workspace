package com.cts.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="student")
public class Student {
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	private int sid;
	@Column(name="student_name")
	private String studentName;
	@ManyToOne
    @JoinColumn(name="department_dno", nullable=false)
	private Department department;

}
