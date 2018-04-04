/**
 * Класс конвертирующий код в текст
 */
package converter;

import codeMaps.CodeMortheMapENG;
import codeMaps.CodeMortheMapRUS;
import controllers.output.Printer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ToText {

    private final String CONVERT_LANG;
    private HashMap<Character, String> map = new HashMap<>();

    public ToText(String lang) {
        this.CONVERT_LANG = lang;
    }

    public void converterFromCodeToText(final String[] code) {

        getLangMap();

        Set<Map.Entry<Character, String>> entries = map.entrySet();

        String text = "";
        for(String i : code){
           for(Map.Entry<Character, String> pair : entries){
               if(i.equals(pair.getValue())){
                   text += pair.getKey();
               }
           }
        }

        Printer printer = new Printer();
        printer.printer(text);
    }

    private void getLangMap(){

        if(CONVERT_LANG.equals("rus")){
            map = CodeMortheMapRUS.getMap();
        }
        else if(CONVERT_LANG.equals("eng")){
            map = CodeMortheMapENG.getMap();
        }
    }
}