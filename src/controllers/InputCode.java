package controllers;

import controllers.input.Reader;
import controllers.output.Printer;
import converter.ToText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputCode {

    private final Printer printer = new Printer();

    public void inputYouCode() throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Reader reader = new Reader();

        printer.printer("Language of output text \n RUS - RUSSIAN\n ENG - ENGLISH:");
        String lang = reader.reader().toLowerCase();

        wrongInput(lang);

        printer.printer("Input your code in space:\n Используйте пробел для резделения кода!\n Используйте символ | для разделения слов!");
        String[] inputeCode = bufferedReader.readLine().split(" ");

        ToText toText = new ToText(lang);
        toText.getConverter(inputeCode);
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
