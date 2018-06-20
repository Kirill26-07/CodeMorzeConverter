package controllers.converter;

import controllers.output.IPrinter;
import model.ICodeMortheMap;
import java.util.HashMap;
import java.util.Map;

public class Converter {

    protected final ICodeMortheMap mapRUS;
    protected final ICodeMortheMap mapENG;
    protected final IPrinter printer;
    protected Map<Character, String> map = new HashMap<>();

    public Converter(final ICodeMortheMap mapRUS, final ICodeMortheMap mapENG, final IPrinter printer) {
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
