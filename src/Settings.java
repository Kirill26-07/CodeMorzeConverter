import controllers.InputCode;
import controllers.InputText;
import controllers.input.Reader;
import controllers.output.Printer;
import converter.ToText;

import java.io.IOException;

public class Settings {

    private final Reader input = new Reader();
    private final Printer output = new Printer();
    private final InputText inputText = new InputText();
    private final InputCode inputCode = new InputCode();

    public final void startGame() throws IOException {

        final String TEXT_INPUT = "1";
        final String CODE_INPUT = "2";
        final String EXIT = "0";

        output.printer("Для конвертации из текста в код нажмите 1. \nДля конвертации из кода в текс нажмите 2. \nДля отмены нажмите 0.");
        String youChoice = input.reader();

        if(youChoice.equals(CODE_INPUT)) {
            output.printer("На каком языке выводить текст?\n 1 - RUS\n 2 - ENG:");

            ToText.WHAT_LANG = input.reader();
        }

            switch (youChoice) {
                case TEXT_INPUT: {
                    inputText.inputYouText();
                    break;
                }
                case CODE_INPUT: {
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
            output.printer("Вы ввели неверное значение!!! Повторите ввод: \n");
            try {
                startGame();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
