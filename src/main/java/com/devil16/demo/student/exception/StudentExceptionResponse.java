package com.devil16.demo.student.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentExceptionResponse {
	
	String errorCode;
	String errorMessage;
	String httpReason;
	
}
