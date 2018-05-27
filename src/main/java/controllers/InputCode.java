/**
 * Класс принимающий и обрабатывающий код для конвертации
 */
package controllers;
import controllers.converter.IToTextConverter;
import controllers.output.IPrinter;
import view.IReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputCode {

    private final IPrinter printer;
    private final IReader reader;
    private final IToTextConverter toText;

    public InputCode(final IPrinter printer, final IReader reader, IToTextConverter toText) {
        this.printer = printer;
        this.reader = reader;
        this.toText = toText;
    }

    public void inputYouCode() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        printer.printer("Write Language of output text\n RUS - RUSSIAN\n ENG - ENGLISH:");
        String lang = reader.reader().toLowerCase();

        wrongInput(lang);

        printer.printer("Input your code in space:\n Используйте пробел для резделения кода!\n Используйте символ | для разделения слов!");
        String[] inputCode = bufferedReader.readLine().split(" ");
        bufferedReader.close();
        toText.converterFromCodeToText(inputCode, lang);
    }

    private void wrongInput(final String lang) throws IOException {
        if (lang.equals("rus") || lang.equals("eng")) {
            return;
        } else {
            printer.printer("You input wrong value, please try again!");
            inputYouCode();
        }
    }
}
