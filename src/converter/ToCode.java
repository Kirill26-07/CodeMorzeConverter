package converter;

import codeMaps.CodeMortheMap;
import view.OutputResult;

import java.util.Map;

public class ToCode {

    private static String code = new String();

    private static void converterFromTextToCode(final char[] text){
        OutputResult outputResult = new OutputResult();

        Map<Character, String> map = CodeMortheMap.getMap();

        for(char i : text){

            code = code + (map.get(i) + " ");
        }

        outputResult.printResult(code);
    }

    public static void getConverter(final char[] text){
        converterFromTextToCode(text);
    }

}
