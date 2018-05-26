package model;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class CodeMortheMapTest {

    @Test
    void getMap() {
        HashMap<Character, String> map = CodeMortheMapENG.getMap();
        Set<Map.Entry<Character, String>> entries = map.entrySet();

        Character val = 'w';
        String val1 = "--.-";

        for (Map.Entry<Character, String> pair : entries) {
            if(val1.equals(pair.getValue())) {
                System.out.println(pair.getKey());
            }
        }
        System.out.println(map.get(val));
    }
}