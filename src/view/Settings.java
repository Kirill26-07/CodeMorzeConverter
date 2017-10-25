package view;

import java.io.IOException;
import java.util.Scanner;

import controllers.InputCode;
import controllers.InputText;

public class Settings {

    public final void startGameSettings() throws IOException {

        InputText inputText = new InputText();
        Scanner sc = new Scanner(System.in);
        int youShoise;

        do {
            System.out.println("Для кодировки текста в код 'Морзе' нажмите 1, для декодироровки кода в текст нажмите 2.");
            System.out.println("Для выхода нажмите '0'.");
            youShoise = sc.nextInt();

            switch (youShoise) {
                case 1: {
                    InputText.InputYouText();
                    break;
                }
                case 2: {
                    InputCode.InputYouCode();
                    break;
                }
                case 0: {
                    System.out.println("Выход из программы!");
                    break;
                }
                default: {
                    System.out.println("Вы ввели неверное значение, повторите ввод: ");
                    break;
                }
            }
        }
        while (youShoise != 1 && youShoise !=2 && youShoise != 0);
    }
}
