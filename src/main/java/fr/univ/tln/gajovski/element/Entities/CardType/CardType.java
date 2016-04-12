package fr.univ.tln.gajovski.element.Entities.CardType;

import fr.univ.tln.gajovski.element.AppParams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Maxime on 10/04/2016.
 */
public enum CardType implements ICardType {

    NONE    (CardTypeCsts.NONE,     CardTypeCsts.NONE_WEAKNESSES,       AppParams.LANGUAGES_CTRL.getWord("None")),
    FIRE    (CardTypeCsts.FIRE,     CardTypeCsts.FIRE_WEAKNESSES,       AppParams.LANGUAGES_CTRL.getWord("Fire")),
    WATER   (CardTypeCsts.WATER,    CardTypeCsts.WATER_WEAKNESSES,      AppParams.LANGUAGES_CTRL.getWord("Water")),
    ICE     (CardTypeCsts.ICE,      CardTypeCsts.ICE_WEAKNESSES,        AppParams.LANGUAGES_CTRL.getWord("Ice")),
    GROUND  (CardTypeCsts.GROUND,   CardTypeCsts.GROUND_WEAKNESSES,     AppParams.LANGUAGES_CTRL.getWord("Ground")),
    WIND    (CardTypeCsts.WIND,     CardTypeCsts.WIND_WEAKNESSES,       AppParams.LANGUAGES_CTRL.getWord("Wind")),
    ELECTRIC(CardTypeCsts.ELECTRIC, CardTypeCsts.ELECTRIC_WEAKNESSES,   AppParams.LANGUAGES_CTRL.getWord("Electric")),
    METAL   (CardTypeCsts.METAL,    CardTypeCsts.METAL_WEAKNESSES,      AppParams.LANGUAGES_CTRL.getWord("Metal")),
    PLANT   (CardTypeCsts.PLANT,    CardTypeCsts.PLANT_WEAKNESSES,      AppParams.LANGUAGES_CTRL.getWord("Plant"));

    private final int       symbol;
    private final String    label;
    private final int[]     weaknesses;

    CardType(int symbol, int weaknesses[], String label){
        this.symbol     = symbol;
        this.label      = label;
        this.weaknesses = weaknesses.clone();

        staticCardTypeMap.put(this.symbol, this);
    }

    public int getSymbol() {
        return symbol;
    }

    public String getLabel() {
        return label;
    }

    public int[] getWeaknesses() {
        return weaknesses;
    }

    public static String getLabelsFromSymbol(int[] symbols){
        String result = "";
        for (int symbol : symbols)
            result += (getLabelFromSymbol(symbol) + ", ");
        return (result.length() <= 0) ?  result : result.substring(0, result.length()- 2);
    }

    public static String getLabelFromSymbol(int symbol){
        return AppParams.LANGUAGES_CTRL.getWord(CardTypeCsts.LABELS[symbol]);
    }

    @Override
    public String toString() {
        return display();
    }
}
