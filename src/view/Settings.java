package view;

import controllers.InputCode;
import controllers.InputText;

import java.io.IOException;
import java.util.Scanner;

public class Settings {

    public final void startGame() throws IOException {
        Scanner scanner = new Scanner(System.in);
        InputText inputText = new InputText();
        InputCode inputCode = new InputCode();

        int youChoise;

        do {
        System.out.println("Для конвертации из текста в код нажмите 1. \nДля конвертации из кода в текс нажмите 2. \nДля отмены нажмите 0.");
        youChoise = scanner.nextInt();

            switch (youChoise) {
                case 1: {
                    inputText.inputYouText();
                    break;
                }
                case 2: {
                    inputCode.inputYouCode();
                    break;
                }
                case 0: {
                    System.out.println("EXIT!");
                    break;
                }
            }
        }
        while (youChoise !=1 && youChoise !=2 && youChoise !=0);
    }
}
