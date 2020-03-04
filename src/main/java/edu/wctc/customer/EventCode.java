package edu.wctc.customer;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Constraint(validatedBy = EventCodeConstraintValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EventCode {

    String value() default "EVT";

    String message() default "must start with EVT";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
