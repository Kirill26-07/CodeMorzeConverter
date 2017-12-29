package codeMaps;

import java.util.HashMap;
import java.util.Map;

public final class DecodingMapENG {

    private static Map<String, String> map = new HashMap<>();


    private DecodingMapENG() {

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
        map.put(" ", "");
        map.put("|", " ");

    }

    public static Map<String, String> getMapENG() {
        DecodingMapENG decodingMapENG = new DecodingMapENG();
        return map;
    }
}

