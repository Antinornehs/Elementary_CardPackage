package fr.univ.tln.gajovski.element.Entities.CardType;

import fr.univ.tln.gajovski.element.Entities.Card.ICard;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maxime on 11/04/2016.
 */
public interface ICardType {

    Map<Integer, ICardType> staticCardTypeMap = new HashMap<>();

    int     getSymbol();
    String  getLabel();
    int[]   getWeaknesses();

    default String display(){
        return  "Label: " + getLabel() + "\n" +
                "Symbol : " + getSymbol() + "\n" +
                "Weaknesses : " + CardType.getLabelsFromSymbol(getWeaknesses())+ "\n";

    }
}
