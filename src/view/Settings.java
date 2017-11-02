package view;

import controllers.InputCode;
import controllers.InputText;
import converter.ToText;

import java.io.IOException;
import java.util.Scanner;

public class Settings {

    private static final String TEXT_INPUT = "1";
    private static final String CODE_INPUT = "2";
    private static final String EXIT = "0";

    Scanner scanner = new Scanner(System.in);
    InputText inputText = new InputText();
    InputCode inputCode = new InputCode();

    public final void startGame() throws IOException {

        String youChoice;
        String lang;

        System.out.println("Для конвертации из текста в код нажмите 1. \nДля конвертации из кода в текс нажмите 2. \nДля отмены нажмите 0.");
        youChoice = scanner.nextLine();

        if(youChoice.equals(CODE_INPUT)) {
            System.out.println("На каком языке выводить текст?\n 1 - RUS\n 2 - ENG:");

            lang = scanner.nextLine();

            ToText.WHAT_LANG = lang;
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
                    System.out.println("EXIT!");
                    break;
                }
                default: {
                    System.out.println("Вы ввели неверное значение!!! Повторите ввод: \n");
                    startGame();
                }
            }
        }
    }
