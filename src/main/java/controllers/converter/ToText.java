/**
 * Класс конвертирующий код в текст
 */
package controllers.converter;
import controllers.output.IPrinter;
import model.CodeMortheMapENG;
import model.CodeMortheMapRUS;
import controllers.output.Printer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ToText {

    private final CodeMortheMapRUS mapRUS;
    private final CodeMortheMapENG mapENG;
    private final IPrinter printer;

    private final String CONVERT_LANG;
    private HashMap<Character, String> map = new HashMap<>();

    public ToText(final String lang, final CodeMortheMapRUS mapRUS, final CodeMortheMapENG mapENG, final IPrinter printer) {
        this.CONVERT_LANG = lang;
        this.mapRUS = mapRUS;
        this.mapENG = mapENG;
        this.printer = printer;
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
        printer.printer(text);
    }

    private void getLangMap(){
        if (CONVERT_LANG.equals("rus")) {
            map = mapRUS.getMap();
        } else if (CONVERT_LANG.equals("eng")) {
            map = mapENG.getMap();
        }
    }
}