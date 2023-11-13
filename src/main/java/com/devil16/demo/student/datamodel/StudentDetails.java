package com.devil16.demo.student.datamodel;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student_details")
public class StudentDetails {
	
	@Id
	@Column(name="enrollment_id")
	private String enrollmentId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="class")
	private String classOf;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth; 
	
	@Column(name="status")
	private String status;

}
