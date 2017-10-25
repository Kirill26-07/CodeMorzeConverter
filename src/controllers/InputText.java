package controllers;

import converter.ToCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

    public class InputText{
            static private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            private static char[] inputText;
            static ToCode toCode = new ToCode();

        public static void InputYouText() throws IOException{
            System.out.println("Введите текст для кодировки: ");

            String text = br.readLine();

            inputText = text.toCharArray();

            toCode.FromTextToCode();

        }

        public static char[] getInputText() {
            return inputText;
        }


    }
