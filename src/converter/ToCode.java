package converter;

import codeMaps.CodeMortheMapRUS;
import controllers.output.Printer;

import java.util.Map;

public class ToCode {

    private static String code;

    public static void converterFromTextToCode(final char[] text) {

        Map<Character, String> map = CodeMortheMapRUS.getMap();

        for (char i : text) {

            code = code + (map.get(i) + " ");
        }

        Printer printer = new Printer();
        printer.printer(code);
    }
}