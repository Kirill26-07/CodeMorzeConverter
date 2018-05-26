/**
 * Класс задающий предварительные настройки конвертации
 */
import controllers.InputCode;
import controllers.InputText;
import controllers.output.IPrinter;
import view.IReader;
import java.io.IOException;

public class StartBoard implements ISimpleBoard{

    private final IReader input;
    private final IPrinter output;

    public StartBoard(final IReader input, final IPrinter output) {
        this.input = input;
        this.output = output;
    }

    final public void startConverting() throws IOException {
        final String TEXT_INPUT = "1";
        final String CODE_INPUT = "2";
        final String EXIT = "0";

        output.printer("For convert from text to code input - 1. \nFor convert from code to text input - 2. \nExit - input 0.");
        final String youChoice = input.reader();

         switch (youChoice) {
             case TEXT_INPUT: {
                 final InputText inputText = new InputText(converter);
                 inputText.inputYouText();
                 break;
             }
             case CODE_INPUT: {
                 final InputCode inputCode = new InputCode(printer, reader, toText);
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
           startConverting();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}