package edu.wctc.customer;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class EventCodeConstraintValidator implements ConstraintValidator<EventCode, String> {

    private String eventPrefix;

    @Override
    public void initialize(EventCode annotation){
        eventPrefix =annotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.startsWith(eventPrefix);
    }

}
