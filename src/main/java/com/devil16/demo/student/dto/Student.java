package com.devil16.demo.student.dto;


import java.time.LocalDate;

import org.apache.commons.lang3.StringUtils;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Student {
	@Builder.Default
	private String enrollmentId = StringUtils.EMPTY;
	@Builder.Default
	private String name = StringUtils.EMPTY;
	@Builder.Default
	private String ofClass = StringUtils.EMPTY;
	@Builder.Default
	private LocalDate dateOfBirth = LocalDate.of(1923,06,01);
	@Builder.Default
	private String contact = StringUtils.EMPTY;
}
