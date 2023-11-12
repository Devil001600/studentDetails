package com.devil16.demo.student.exception;

import lombok.Getter;

@Getter
public class StudentException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private Integer statusCode;
	
	public StudentException(String message, String errorCode, Integer statusCode) {
		super(message);
		this.errorCode = errorCode;
		this.statusCode = statusCode;
	}
	
}
