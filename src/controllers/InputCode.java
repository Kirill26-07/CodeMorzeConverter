package controllers;


import converter.ToText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputCode {

    public void inputYouCode() throws  IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ToText toText = new ToText();

        System.out.println("Input your code in space:");

        String[] inputeCode = bufferedReader.readLine().split(" ");

        toText.converterFromCodeToText(inputeCode);

    }
}
