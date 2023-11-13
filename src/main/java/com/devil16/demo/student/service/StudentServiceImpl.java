package com.devil16.demo.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devil16.demo.student.datamodel.StudentDetails;
import com.devil16.demo.student.repository.StudentRepository;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Service
@Data
@Slf4j
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<StudentDetails> fetchAllStudents() {
		
		log.info("fetched data : {}", studentRepository.findAll());
		return studentRepository.findAll();
		
	}

	@Override
	public List<StudentDetails> fetchAllStudentsOfClass(String classOf) {
		
		return studentRepository.findByClassOf(classOf);
		
	}
	
	
}
