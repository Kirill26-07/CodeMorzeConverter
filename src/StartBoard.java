/**
 * Класс задающий предварительные настройки конвертации
 */
import controllers.InputCode;
import controllers.InputText;
import controllers.input.Reader;
import controllers.output.Printer;
import java.io.IOException;

public class StartBoard {

    private final Reader input = new Reader();
    private final Printer output = new Printer();

    final void startConvert() throws IOException {

        final String TEXT_INPUT = "1";
        final String CODE_INPUT = "2";
        final String EXIT = "0";

        output.printer("For convert from text to code input - 1. \nFor convert from code to text input - 2. \nExit - input 0.");
        final String youChoice = input.reader();

         switch (youChoice) {
             case TEXT_INPUT: {
                 final InputText inputText = new InputText();
                 inputText.inputYouText();
                 break;
             }
             case CODE_INPUT: {
                 final InputCode inputCode = new InputCode();
                 inputCode.inputYouCode();
                 break;
             }
             case EXIT: {
                 output.printer("EXIT!");
                 break;
             }
             default: {
                 wrongValue();
             }
         }
     }

    private void wrongValue() {
       output.printer("You input wrong value, please try again: \n");
       try {
           startConvert();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}