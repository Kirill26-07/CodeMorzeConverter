package view;

import controllers.InputCode;
import controllers.InputText;

import java.io.IOException;
import java.util.Scanner;

public class Settings {

    private static final int TEXT_INPUT = 1;
    private static final int CODE_INPUT = 2;
    private static final int EXIT = 0;

    public final void startGame() throws IOException {

        Scanner scanner = new Scanner(System.in);
        InputText inputText = new InputText();
        InputCode inputCode = new InputCode();

        int youChoice;

        do {

        System.out.println("Для конвертации из текста в код нажмите 1. \nДля конвертации из кода в текс нажмите 2. \nДля отмены нажмите 0.");
        youChoice = scanner.nextInt();

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
                    System.out.println("EXIT!");
                    break;
                }
                default: {
                    System.out.println("Вы ввели неверное значение!!! Повторите ввод: \n");
                }
            }
        }
        while (youChoice !=1 && youChoice !=2 && youChoice !=0);
    }
}
