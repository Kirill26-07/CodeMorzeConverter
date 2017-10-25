package converter;

import java.util.Map;

public class ToText {
    static private String[] code;

    static void FromCodeToText(Map<Character, String> map) {
        for (int i = 0; i < code.length; i++) {
            String val = code[i];
            if (map.keySet().equals(val)) {
                System.out.print(map.get(val));
            }
        }
    }
}