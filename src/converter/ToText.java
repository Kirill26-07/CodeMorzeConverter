package converter;

import codeMaps.DecodingMapENG;
import codeMaps.DecodingMapRUS;
import view.OutputResult;

import java.util.Map;

public class ToText {

    public static String WHAT_LANG;

    private static final String CONVERT_TO_RUS = "1";
    private static final String CONVERT_TO_ENG = "2";
    private static String text = new String();

    public static void getConverter(String[] code){

        ToText toText = new ToText();

        toText.converterFromCodeToText(code);
    }

    private void converterFromCodeToText(String[] code){

        OutputResult outputResult = new OutputResult();

        Map<String, String> map = null;
        
        if(WHAT_LANG.equals(CONVERT_TO_RUS)){
           map = DecodingMapRUS.getMapRUS();
        }
        else if(WHAT_LANG.equals(CONVERT_TO_ENG)){
            map = DecodingMapENG.getMapENG();
        }

        for(String i : code){
            text = text + (map.get(i));
        }

        outputResult.printResult(text);
    }
}