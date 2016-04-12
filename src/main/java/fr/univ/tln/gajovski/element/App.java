package fr.univ.tln.gajovski.element;

import fr.univ.tln.gajovski.element.Entities.Card.Card;
import fr.univ.tln.gajovski.element.Entities.Card.CardBuilder;
import fr.univ.tln.gajovski.element.Entities.Card.CardGenerator;
import fr.univ.tln.gajovski.element.Entities.Card.ICard;
import fr.univ.tln.gajovski.element.Entities.CardType.CardType;
import fr.univ.tln.gajovski.element.Entities.CardType.ICardType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ICard c = new CardBuilder().id("1000111").type(CardType.ELECTRIC).weaknesses(new int[]{1,2,3,4}).build();
        System.out.println(c);
        System.out.println(CardGenerator.generateCardFromId("11212"));
//
//        Card a = new Card();
//        a.setType(CardType.NONE);
//        System.out.println(a.getType());
//        System.out.println( "Hello World!" );
    }
}
