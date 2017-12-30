package converter;

import codeMaps.CodeMortheMap;
import controllers.output.Printer;

import java.util.Map;

public class ToCode {

    private static String code;

    public static void converterFromTextToCode(final char[] text) {

        Map<Character, String> map = CodeMortheMap.getMap();

        for (char i : text) {

            code = code + (map.get(i) + " ");
        }

        Printer printer = new Printer();
        printer.printer(code);
    }
}