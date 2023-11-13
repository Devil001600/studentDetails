package com.devil16.demo.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devil16.demo.student.datamodel.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, String> {
	
	public List<StudentDetails> findByClassOf(String classOf);
	
}
