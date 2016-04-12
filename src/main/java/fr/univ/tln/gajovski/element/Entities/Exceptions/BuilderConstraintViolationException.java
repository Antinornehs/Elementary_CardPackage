package fr.univ.tln.gajovski.element.Entities.Exceptions;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Maxime on 11/04/2016.
 */
public class BuilderConstraintViolationException extends ConstraintViolationException {

    public BuilderConstraintViolationException(String message, Set<? extends ConstraintViolation<?>> constraintViolations) {
        super(message, constraintViolations);
    }

    public BuilderConstraintViolationException(Set<? extends ConstraintViolation<?>> constraintViolations) {
        super(constraintViolations);
        Iterator<? extends ConstraintViolation<?>> iterator = constraintViolations.iterator();
        while(iterator.hasNext()){
            ConstraintViolation<?> cv = iterator.next();
            System.err.println(cv.getRootBeanClass().getSimpleName()+"."+cv.getPropertyPath() + " " +cv.getMessage());

        }
    }
}
