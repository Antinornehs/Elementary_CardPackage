package fr.univ.tln.gajovski.element.Entities.Card.Constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Maxime on 11/04/2016.
 */

@NotNull(message = "{Card.weaknesses.null}")
@Size(min = 4, max = 4, message = "{Card.weaknesses.size}")
@Target({FIELD, PARAMETER, ANNOTATION_TYPE, METHOD})
@Retention(RUNTIME)
@Constraint(validatedBy = {})

public @interface Card_weaknesses{
    String message() default "{default}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}