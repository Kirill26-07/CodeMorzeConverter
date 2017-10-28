package controllers;


import converter.ToCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputText{

        public void inputYouText() throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ToCode toCode = new ToCode();

            System.out.println("Input your text:");

            char[] text = bufferedReader.readLine().toCharArray();
            toCode.converterFromTextToCode(text);
        }
}
