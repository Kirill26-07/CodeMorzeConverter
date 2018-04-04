package controllers.input;

import java.util.Scanner;

public class Reader implements IReader {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String reader() {
        return scanner.nextLine();
    }
}
