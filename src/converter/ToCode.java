package converter;

import codeMaps.CodeMortheMap;
import view.OutputResult;

import java.util.Map;

public class ToCode {

     String code = new String();

    public void converterFromTextToCode(char[] text){
        OutputResult outputResult = new OutputResult();

        Map<Character, String> map = CodeMortheMap.getMap();

        for(char i : text){
            code = code + (map.get(i) + " ");
        }

        outputResult.printResult(code);
    }

}
