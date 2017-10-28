package converter;

import codeMaps.CodeMortheMap;
import view.OutputResult;

import java.util.Map;

public class ToCode {

     String code = new String();

    public void converterFromTextToCode(char[] text){
        OutputResult outputResult = new OutputResult();

        Map<Character, String> map = CodeMortheMap.getMap();

        for(int i = 0; i < text.length; i++){
            char val = text[i];
            code = code + (map.get(val) + " ");
        }

        outputResult.printResult(code);
    }

}
