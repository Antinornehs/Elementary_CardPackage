package fr.univ.tln.gajovski.element.Entities.Card;

import fr.univ.tln.gajovski.element.AppParams;
import fr.univ.tln.gajovski.element.Entities.Card.Constraints.Card_Id;
import fr.univ.tln.gajovski.element.Entities.CardType.ICardType;
import fr.univ.tln.gajovski.element.Entities.Exceptions.BuilderConstraintViolationException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Maxime on 11/04/2016.
 */
public class CardBuilder {

    @Card_Id
    String        id;
    ICardType     type;
    int[]         weaknesses;



    public CardBuilder(){
    }

    public CardBuilder id(String id){
        this.id = id;
        return this;
    }

    public CardBuilder type(ICardType type){
        this.type = type;
        return this;
    }

    public CardBuilder weaknesses(int[] weaknesses){
        this.weaknesses = weaknesses;
        return this;
    }
    private void validate(){
        Set<ConstraintViolation<CardBuilder>> constraintViolations = AppParams.validator.validate(this);
        if (!constraintViolations.isEmpty()) {
            throw new BuilderConstraintViolationException(new HashSet<>(constraintViolations));
        }
    }

    public ICard build(){
        validate();
        return new Card(this);
    }

}
