package fr.univ.tln.gajovski.element.Entities.Card;

import fr.univ.tln.gajovski.element.Entities.Card.Constraints.Card_Id;
import fr.univ.tln.gajovski.element.Entities.CardType.ICardType;

/**
 * Created by Maxime on 10/04/2016.
 */
public class Card implements ICard{

    @Card_Id
    private String      id;

    private ICardType   type;

    private int[]       weaknesses;

     Card(CardBuilder cardBuilder){
        this.id         = cardBuilder.id;
        this.type       = cardBuilder.type;
        this.weaknesses = cardBuilder.weaknesses;
    }

    public String   getId() {
        return id;
    }

    public ICardType getType() {
        return type;
    }

    public int[]    getWeaknesses() {
        return weaknesses;
    }

    @Override
    public String toString() {
        return display();
    }
}
