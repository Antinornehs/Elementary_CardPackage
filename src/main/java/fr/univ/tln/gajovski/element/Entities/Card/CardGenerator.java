package fr.univ.tln.gajovski.element.Entities.Card;

import fr.univ.tln.gajovski.element.Entities.CardType.CardType;
import fr.univ.tln.gajovski.element.Entities.CardType.ICardType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Maxime on 11/04/2016.
 */
public class CardGenerator {

    public static List<String> generateAllIds() {
        List<String> allCards = new ArrayList<>();
        int[] cardinalWeaknesses = new int[4];

        for (CardType currentType : CardType.values())
            for (int WEST : currentType.getWeaknesses())
                for (int NORTH : currentType.getWeaknesses())
                    for (int EAST : currentType.getWeaknesses())
                        for (int SOUTH : currentType.getWeaknesses()) {
                            cardinalWeaknesses[0] = WEST ;
                            cardinalWeaknesses[1] = NORTH;
                            cardinalWeaknesses[2] = EAST;
                            cardinalWeaknesses[3] = SOUTH ;
                            allCards.add(Arrays.toString(cardinalWeaknesses));
                        }

        for (CardType currentType : CardType.values())
            for(int firstWeakness : currentType .getWeaknesses())
                for(int secondWeakness : currentType .getWeaknesses())
                    for(int thirdWeakness: currentType .getWeaknesses()) {

                        cardinalWeaknesses[0] = 0;
                        cardinalWeaknesses[1] = firstWeakness ;
                        cardinalWeaknesses[2] = secondWeakness;
                        cardinalWeaknesses[3] = thirdWeakness;

                        allCards.add(Arrays.toString(cardinalWeaknesses));

                        cardinalWeaknesses[0] = thirdWeakness;
                        cardinalWeaknesses[1] = 0;
                        cardinalWeaknesses[2] = firstWeakness ;
                        cardinalWeaknesses[3] = secondWeakness;

                        allCards.add(Arrays.toString(cardinalWeaknesses));

                        cardinalWeaknesses[0] = secondWeakness;
                        cardinalWeaknesses[1] = thirdWeakness;
                        cardinalWeaknesses[2] = 0;
                        cardinalWeaknesses[3] = firstWeakness ;


                        allCards.add(Arrays.toString(cardinalWeaknesses));

                        cardinalWeaknesses[0] = firstWeakness ;
                        cardinalWeaknesses[1] = secondWeakness;
                        cardinalWeaknesses[2] = thirdWeakness;
                        cardinalWeaknesses[3] = 0;

                        allCards.add(Arrays.toString(cardinalWeaknesses));
                    }
        return allCards;
    }


    public static ICard generateCardFromId(String id){
        int[] intId = Arrays.stream(id.split("")).mapToInt(Integer::parseInt).toArray();
        return new CardBuilder()
                .id(id)
                .type(ICardType.staticCardTypeMap.get(intId[0]))
                .weaknesses(Arrays.copyOfRange(intId, 1, 5)).build();
//        int[] weaknesses = {Character.getNumericValue(values[1]), Character.getNumericValue(values[2]),
//                Character.getNumericValue(values[3]), Character.getNumericValue(values[4])};
//
//        System.out.println((int)values[0]);
//
//        Card c = new GenericBuilder<Card>(Card.class).with("id", id)
//                .with("type", Type.allTypes.get(Character.getNumericValue(values[0])))
//                .with("weaknesses", weaks).build();
//        c.setRarity(calculateRarity(c));
//
//        return c;
    }


}
