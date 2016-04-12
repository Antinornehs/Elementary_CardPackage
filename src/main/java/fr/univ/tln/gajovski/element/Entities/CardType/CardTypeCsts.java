package fr.univ.tln.gajovski.element.Entities.CardType;

/**
 * Created by Maxime on 10/04/2016.
 */
final class CardTypeCsts {

    //TODO à améliorer possibilité de faire des erreurs ! (Impl système de pair ?!)
    static final String[] LABELS = {"None", "Fire", "Water", "Ice", "Ground", "Wind", "Electric", "Metal", "Plant"};


    static final int NONE       = 0;
    static final int FIRE       = 1;
    static final int WATER      = 2;
    static final int ICE        = 3;
    static final int GROUND     = 4;
    static final int WIND       = 5;
    static final int ELECTRIC   = 6;
    static final int METAL      = 7;
    static final int PLANT      = 8;

    static final int[] NONE_WEAKNESSES     = {};
    static final int[] FIRE_WEAKNESSES     = {2,3,4};
    static final int[] WATER_WEAKNESSES    = {3,6,8};
    static final int[] ICE_WEAKNESSES      = {1,7};
    static final int[] GROUND_WEAKNESSES   = {2,5,8};
    static final int[] WIND_WEAKNESSES     = {1,7,8};
    static final int[] ELECTRIC_WEAKNESSES = {4,5};
    static final int[] METAL_WEAKNESSES    = {1,2,6};
    static final int[] PLANT_WEAKNESSES    = {1,3,4};

}
