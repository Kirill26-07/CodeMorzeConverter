/**
 * Класс принимающий и обрабатывающий текст для конвертации
 */

package controllers;

import controllers.output.Printer;
import converter.ToCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputText {

        public void inputYouText() throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Printer printer = new Printer();

            printer.printer("Input your text:");

            char[] text = bufferedReader.readLine().toCharArray();

            bufferedReader.close();

            ToCode.converterFromTextToCode(text);
        }
}
