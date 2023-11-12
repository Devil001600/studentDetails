package com.devil16.demo.student.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apache.commons.lang3.StringUtils;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {ValidErollmentId.ValidErollmentIdValidator.class})
@Documented
public @interface ValidErollmentId {
	
	String patternErollmentId = "^[A-Z0-9]{7}$";
	
	String message() default "{invalid_enrollment_id}";
	
	Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
    
    class ValidErollmentIdValidator implements ConstraintValidator<ValidErollmentId, String> {
    	
    	@Override
		public boolean isValid(String enrollmentId, ConstraintValidatorContext context) {
			
			return ((!StringUtils.isEmpty(enrollmentId))&&(enrollmentId.matches(patternErollmentId)));
			
		}
    
    }
}
