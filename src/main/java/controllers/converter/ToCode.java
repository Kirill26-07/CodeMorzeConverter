/**
 * Класс конвертирующий текст в код
 */
package controllers.converter;

import controllers.output.IPrinter;
import model.CodeMortheMapRUS;
import java.util.Map;

public class ToCode implements IToCodeConverter {

    private final IPrinter printer;
    private final CodeMortheMapRUS mapRUS;

    public ToCode(final IPrinter printer, final CodeMortheMapRUS mapRUS) {
        this.printer = printer;
        this.mapRUS = mapRUS;
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