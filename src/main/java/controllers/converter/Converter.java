package controllers.converter;

import controllers.output.IPrinter;
import model.CodeMortheMapENG;
import model.CodeMortheMapRUS;
import java.util.HashMap;

public class Converter {

    protected final CodeMortheMapRUS mapRUS;
    protected final CodeMortheMapENG mapENG;
    protected final IPrinter printer;
    protected HashMap<Character, String> map = new HashMap<>();

    public Converter(final CodeMortheMapRUS mapRUS, final CodeMortheMapENG mapENG, final IPrinter printer) {
        this.mapRUS = mapRUS;
        this.mapENG = mapENG;
        this.printer = printer;
    }

    protected void getLangMap(final String lang){
        if (lang.equals("rus")) {
            map = mapRUS.getMap();
        } else if (lang.equals("eng")) {
            map = mapENG.getMap();
        }
    }
}
