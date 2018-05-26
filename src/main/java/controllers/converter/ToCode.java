/**
 * Класс конвертирующий текст в код
 */

package controllers.converter;
import model.CodeMortheMapRUS;
import controllers.output.Printer;
import java.util.Map;

public class ToCode {

    private final CodeMortheMapRUS mapRUS;
    private static String code;

    public ToCode(final CodeMortheMapRUS mapRUS) {
        this.mapRUS = mapRUS;
    }

    public void converterFromTextToCode(final char[] text) {
        Map<Character, String> map = mapRUS.getMap();

        for (char i : text) {
            code += (map.get(i) + " ");
        }
        Printer printer = new Printer();
        printer.printer(code);
    }
}