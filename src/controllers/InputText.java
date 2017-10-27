package controllers;


import converter.ToCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputText{

        public void inputYouText() throws IOException {
            System.out.println("Input your text:");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            char[] text = bufferedReader.readLine().toCharArray();
            ToCode.converterFromTextToCode(text);
        }
}
