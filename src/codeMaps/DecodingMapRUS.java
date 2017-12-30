package codeMaps;

import java.util.HashMap;
import java.util.Map;

public class DecodingMapRUS {

    private static Map<String, String> map = new HashMap<>();


    private DecodingMapRUS() {

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
        map.put("-.--", "ы");
        map.put("-..-", "ъ");
        map.put("..-..", "э");
        map.put("..--", "ю");
        map.put("-...", "б");
        map.put(".-.-", "я");
        map.put(" ", "");
        map.put("|", " ");

        // Cимволы

        map.put("......", ".");
        map.put(".-.-.-", ",");
        map.put("-.-.-.", ";");
        map.put("---...", ":");
        map.put("..--..", "?");
        map.put("--..--", "!");
        map.put(".-..-.", "'");


    }


    public static Map<String, String> getMapRUS() {
        DecodingMapRUS decodingMapRUS = new DecodingMapRUS();
        return map;
    }
}
