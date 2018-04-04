/**
 * Класс принимающий и обрабатывающий код для конвертации
 */
package controllers;

import controllers.input.Reader;
import controllers.output.Printer;
import converter.ToText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputCode {

    private final Printer printer = new Printer();
    private final Reader reader = new Reader();

    public void inputYouCode() throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        printer.printer("Write Language of output text\n RUS - RUSSIAN\n ENG - ENGLISH:");
        String lang = reader.reader().toLowerCase();

        wrongInput(lang);

        printer.printer("Input your code in space:\n Используйте пробел для резделения кода!\n Используйте символ | для разделения слов!");
        String[] inputCode = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        ToText toText = new ToText(lang);
        toText.converterFromCodeToText(inputCode);
    }

    private void wrongInput(final String lang) throws IOException{
        if(lang.equals("rus") || lang.equals("eng")){
            return;
        }
        else {
            printer.printer("You input wrong value, please try again!");
            inputYouCode();
        }
    }
}
