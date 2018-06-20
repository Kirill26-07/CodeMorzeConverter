/**
 * Класс конвертирующий код в текст
 */
package controllers.converter;

import controllers.output.IPrinter;
import model.ICodeMortheMap;

import java.util.Map;
import java.util.Set;

public class ToText extends Converter implements IToTextConverter {

    public ToText(final ICodeMortheMap mapRUS, final ICodeMortheMap mapENG, final IPrinter printer) {
        super(mapRUS, mapENG, printer);
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
}