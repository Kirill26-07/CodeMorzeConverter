package converter;
import java.util.Map;
import codeMaps.CodeMortheMap;
import controllers.InputText;

public class ToCode {
    static private char[] text = InputText.getInputText();
    private static Map<Character, String> map = CodeMortheMap.CodeArray();

   public static void FromTextToCode(){
        for(int i = 0; i < text.length; i++){
            char val = text[i];
            if(map.containsKey(val)){
                System.out.print(map.get(val) + " ");
            }
            else {
                System.out.print(val + " не поддерживается! ");
            }
        }
        System.out.println("");
    }

}
