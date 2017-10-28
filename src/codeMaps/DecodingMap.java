package codeMaps;

import java.util.HashMap;
import java.util.Map;

public class DecodingMap {

    private static Map<String, String> map = new HashMap<>();

    private DecodingMap() {

        // Строчные буквы RUS

        map.put(".-", "а");
        map.put(".--", "в");
        map.put("--.", "г");
        map.put("-..", "д");
        map.put(".", "е");
        map.put("...-", "ж");
        map.put("--..", "з");
        map.put("..", "и");
        map.put("-.-", "к");
        map.put(".-..", "л");
        map.put("--", "м");
        map.put("-.", "н");
        map.put("----", "о");
        map.put(".--.", "п");
        map.put(".-.", "р");
        map.put("...", "с");
        map.put("-", "т");
        map.put("..-", "у");
        map.put("..-.", "ф");
        map.put("....", "х");
        map.put("-.-.", "ц");
        map.put("----", "ш");
        map.put("--.-", "щ");
        map.put("-..-", "ь");
        map.put("-.--", "ы");
        map.put("-..-", "ъ");
        map.put("..-..", "э");
        map.put("..--", "ю");
        map.put("-...", "б");
        map.put(".-.-", "я");

        // Строчные буквы ENG                  // Cимволы

        map.put(".-", "a");             map.put("......", ".");
        map.put(".--", "b");            map.put(".-.-.-", ",");
        map.put("--.", "c");            map.put("-.-.-.", ";");
        map.put("-..", "d");            map.put("---...", ":");
        map.put(".", "e");              map.put("..--..", "?");
        map.put("...-", "f");           map.put("--..--", "!");
        map.put("--..", "g");           map.put("-.--.-", "(");
        map.put("..", "h");             map.put("-.--.-", ")");
        map.put("-.-", "i");            map.put(".-..-.", "'");
        map.put(".-..", "j");
        map.put("--", "k");
        map.put("-.", "l");
        map.put("----", "m");
        map.put(".--.", "n");
        map.put(".-.", "o");
        map.put("...", "p");
        map.put("-", "q");
        map.put("..-", "r");
        map.put("..-.", "s");
        map.put("....", "t");
        map.put("-.-.", "u");
        map.put("----", "v");
        map.put("--.-", "w");
        map.put("-..-", "x");
        map.put("-.--", "y");
        map.put("-..-", "z");
        map.put("  ", " ");
        map.put(" ", "");

    }

    public static Map<String, String> getMap() {

        DecodingMap decodingMap = new DecodingMap();

        return map;
    }
}
