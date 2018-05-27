/**
 * Класс конвертирующий код в текст
 */
package controllers.converter;

import controllers.output.IPrinter;
import model.CodeMortheMapENG;
import model.CodeMortheMapRUS;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ToText implements IToTextConverter {

    private final CodeMortheMapRUS mapRUS;
    private final CodeMortheMapENG mapENG;
    private final IPrinter printer;

    private HashMap<Character, String> map = new HashMap<>();

    public ToText(final CodeMortheMapRUS mapRUS, final CodeMortheMapENG mapENG, final IPrinter printer) {
        this.mapRUS = mapRUS;
        this.mapENG = mapENG;
        this.printer = printer;
    }

    @Override
    public void converterFromCodeToText(final String[] code, final String lang) {
        getLangMap(lang);

        Set<Map.Entry<Character, String>> entries = map.entrySet();

        String text = "";
        for(String i : code){
           for(Map.Entry<Character, String> pair : entries){
               if(i.equals(pair.getValue())){
                   text += pair.getKey();
               }
           }
        }
        printer.printer(text);
    }

    private void getLangMap(final String lang){
        if (lang.equals("rus")) {
            map = mapRUS.getMap();
        } else if (lang.equals("eng")) {
            map = mapENG.getMap();
        }
    }
}