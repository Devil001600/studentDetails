package com.devil16.demo.student.exception;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class StudentExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	protected ResponseEntity<StudentExceptionResponse> handleConflict(RuntimeException ex, HttpServletRequest request) {
		
		log.error(ex.getMessage());
		return new ResponseEntity<>(
				new StudentExceptionResponse("XXXX", ex.getMessage().split(": ")[1], HttpStatus.BAD_REQUEST.getReasonPhrase()), HttpStatus.BAD_REQUEST);
		
	}
	
}
