package converter;

import codeMaps.CodeMortheMapENG;
import codeMaps.CodeMortheMapRUS;
import controllers.output.Printer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ToText {


    private final String CONVERT_LANG;
    private String text = "";
    private HashMap<Character, String> map = new HashMap<>();

    public ToText(String lang) {
        this.CONVERT_LANG = lang;
    }

    public void getConverter(final String[] code){
        converterFromCodeToText(code);
    }

    private void converterFromCodeToText(final String[] code){
        converterLangSettings();

        Set<Map.Entry<Character, String>> entries = map.entrySet();

        for(String i : code){
           for(Map.Entry<Character, String> pair : entries){
               if(i.equals(pair.getValue())){
                   text = text + pair.getKey();
               }
           }
        }

        Printer printer = new Printer();
        printer.printer(text);
    }

    private void converterLangSettings(){

        if(CONVERT_LANG.equals("rus")){
            map = CodeMortheMapRUS.getMap();
        }
        else if(CONVERT_LANG.equals("eng")){
            map = CodeMortheMapENG.getMap();
        }


    }
}