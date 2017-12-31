import controllers.InputCode;
import controllers.InputText;
import controllers.input.Reader;
import controllers.output.Printer;
import converter.ToText;

import java.io.IOException;

public class Settings {

    private final Reader input = new Reader();
    private final Printer output = new Printer();

    public final void startGame() throws IOException {

        final String TEXT_INPUT = "1";
        final String CODE_INPUT = "2";
        final String EXIT = "0";

        output.printer("For convert from text to code input - 1. \nFor convert from code to text input - 2. \nExit - input 0.");
        String youChoice = input.reader();


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

        private void wrongValue(){
            output.printer("You input wrong value, please try again: \n");
            try {
                startGame();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
