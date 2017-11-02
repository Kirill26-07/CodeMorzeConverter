package controllers;

import converter.ToText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputCode {

    public void inputYouCode() throws  IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input your code in space:\n Используйте пробел для резделения кода!\n Используйте символ | для разделения слов!");

        String[] inputeCode = bufferedReader.readLine().split(" ");

        ToText.getConverter(inputeCode);
    }
}
