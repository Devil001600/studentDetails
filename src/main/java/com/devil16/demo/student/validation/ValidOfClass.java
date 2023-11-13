package com.devil16.demo.student.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {ValidOfClass.ValidErollmentIdValidator.class})
@Documented
public @interface ValidOfClass {
	
	List<String> validOfClass = List.of("IV", "V", "VI", "VII", "VIII", "IX", "X");
	
	String message() default "{invalid_class_of}";
	
	Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
    
    class ValidErollmentIdValidator implements ConstraintValidator<ValidOfClass, String> {
    	
    	@Override
		public boolean isValid(String classOf, ConstraintValidatorContext context) {
			
			return ((StringUtils.isEmpty(classOf))||(validOfClass.contains(classOf)));
			
		}
    
    }
}
