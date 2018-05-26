package controllers.output;

public class Printer implements IPrinter {

    @Override
    public void printer(String text) {
        System.out.println(text);
    }
}
