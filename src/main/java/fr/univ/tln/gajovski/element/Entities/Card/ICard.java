package fr.univ.tln.gajovski.element.Entities.Card;

import fr.univ.tln.gajovski.element.Entities.CardType.CardType;
import fr.univ.tln.gajovski.element.Entities.CardType.ICardType;

import java.util.Arrays;

/**
 * Created by Maxime on 11/04/2016.
 */
public interface ICard {

    String      getId();
    ICardType   getType();
    int[]       getWeaknesses();

    default String display(){
        return  "Card_Id : "         + getId() + "\n" +
                "Type : "       + getType().getLabel() + "\n" +
                "Weaknesses : " + Arrays.toString(getWeaknesses()) + "\n";
    }
}
