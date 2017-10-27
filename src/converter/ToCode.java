package converter;

import codeMaps.CodeMortheMap;

import java.util.Map;

public class ToCode {

    static String code = new String();

    public static void converterFromTextToCode(char[] text){

        Map<Character, String> map = CodeMortheMap.getMap();

        for(int i = 0; i < text.length; i++){
            char val = text[i];
            code = code + (map.get(val) + " ");
        }

        System.out.println(code);
    }

}
