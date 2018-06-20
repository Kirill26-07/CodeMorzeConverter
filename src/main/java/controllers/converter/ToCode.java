/**
 * Класс конвертирующий текст в код
 */
package controllers.converter;

import controllers.output.IPrinter;
import model.ICodeMortheMap;

import java.util.Map;

public class ToCode extends Converter implements IToCodeConverter {

    public ToCode(final ICodeMortheMap mapRUS, final ICodeMortheMap mapENG, final IPrinter printer) {
        super(mapRUS, mapENG, printer);
    }

    @Override
    public void converterFromTextToCode(final char[] text) {
        final Map<Character, String> map = mapRUS.getMap();
        String code = "";
        for (char i : text) {
            code += (map.get(i) + " ");
        }
        printer.printer(code);
    }
}