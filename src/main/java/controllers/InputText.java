/**
 * Класс принимающий и обрабатывающий текст для конвертации
 */

package controllers;
import controllers.converter.IToCodeConverter;
import controllers.output.IPrinter;
import controllers.output.Printer;
import controllers.converter.ToCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputText {

    private final IToCodeConverter converter;
    private final IPrinter printer;

    public InputText(final IToCodeConverter converter, final IPrinter printer) {
        this.converter = converter;
        this.printer = printer;
    }

    public void inputYouText() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printer.printer("Input your text:");

        char[] text = bufferedReader.readLine().toCharArray();

        bufferedReader.close();
        converter.converterFromTextToCode(text);
    }
}
