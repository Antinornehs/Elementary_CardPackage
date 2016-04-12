package fr.univ.tln.gajovski.element;

import fr.univ.tln.gajovski.element.Utils.LanguagesController;

import javax.validation.*;
/**
 * Created by Maxime on 11/04/2016.
 */
public final class AppParams {

    public static Validator validator;
    public static ValidatorFactory validatorFactory;

    static {
        validatorFactory    = Validation.buildDefaultValidatorFactory();
        validator           = validatorFactory.getValidator();
    }


    private static final String CURRENT_LANGUAGE = "French";

    public static final LanguagesController LANGUAGES_CTRL
            = new LanguagesController(CURRENT_LANGUAGE);

}
