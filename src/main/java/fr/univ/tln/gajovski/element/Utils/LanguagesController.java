package fr.univ.tln.gajovski.element.Utils;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 *
 * @author cedric
 */
public class LanguagesController {

    private static Map<String, Locale> supportedLanguages;
    private ResourceBundle translation;

    static{
        supportedLanguages = new HashMap<String, Locale>();
        supportedLanguages.put("French",    Locale.FRENCH);
        supportedLanguages.put("English",   Locale.ENGLISH);

    }
    public LanguagesController(String language){
        translation = ResourceBundle.getBundle("languages", supportedLanguages.get(language));
    }

    public String getWord(String keyword)
    {
        return translation.getString(keyword);
    }

}