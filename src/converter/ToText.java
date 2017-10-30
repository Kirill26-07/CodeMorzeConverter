package converter;

import codeMaps.DecodingMap;
import view.OutputResult;

import java.util.Map;

public class ToText {

        String text = new String();

    public void converterFromCodeToText(String[] code){

        OutputResult outputResult = new OutputResult();

        Map<String, String> map = DecodingMap.getMap();

        for(String i : code){
            text = text + (map.get(i));
        }

        outputResult.printResult(text);

    }
}