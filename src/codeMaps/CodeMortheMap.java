package codeMaps;

import java.util.HashMap;
import java.util.Map;

    public class CodeMortheMap {

     private static Map<Character, String> map = new HashMap<>();

        private CodeMortheMap() {

            // Строчные буквы RUS

            map.put('а', ".-");
            map.put('в', ".--");
            map.put('г', "--.");
            map.put('д', "-..");
            map.put('е', ".");
            map.put('ж', "...-");
            map.put('з', "--..");
            map.put('и', "..");
            map.put('к', "-.-");
            map.put('л', ".-..");
            map.put('м', "--");
            map.put('н', "-.");
            map.put('о', "----");
            map.put('п', ".--.");
            map.put('р', ".-.");
            map.put('с', "...");
            map.put('т', "-");
            map.put('у', "..-");
            map.put('ф', "..-.");
            map.put('х', "....");
            map.put('ц', "-.-.");
            map.put('ш', "----");
            map.put('щ', "--.-");
            map.put('ь', "-..-");
            map.put('ы', "-.--");
            map.put('ъ', "-..-");
            map.put('э', "..-..");
            map.put('ю', "..--");
            map.put('б', "-...");
            map.put('я', ".-.-");

            // Заглавные буквы RUS

            map.put('А', ".-");
            map.put('В', ".--");
            map.put('Г', "--.");
            map.put('Д', "-..");
            map.put('Е', ".");
            map.put('Ж', "...-");
            map.put('З', "--..");
            map.put('И', "..");
            map.put('К', "-.-");
            map.put('Л', ".-..");
            map.put('М', "--");
            map.put('Н', "-.");
            map.put('О', "----");
            map.put('П', ".--.");
            map.put('Р', ".-.");
            map.put('С', "...");
            map.put('Т', "-");
            map.put('У', "..-");
            map.put('Ф', "..-.");
            map.put('Х', "....");
            map.put('Ц', "-.-.");
            map.put('Ш', "----");
            map.put('Щ', "--.-");
            map.put('Э', "..-..");
            map.put('Ю', "..--");
            map.put('Б', "-...");
            map.put('Я', ".-.-");

            // Строчные буквы ENG                  // Cимволы

            map.put('a', ".-");             map.put('.', "......");
            map.put('b', ".--");            map.put(',', ".-.-.-");
            map.put('c', "--.");            map.put(';', "-.-.-.");
            map.put('d', "-..");            map.put(':', "---...");
            map.put('e', ".");              map.put('?', "..--..");
            map.put('f', "...-");           map.put('!', "--..--");
            map.put('g', "--..");           map.put('(', "-.--.-");
            map.put('h', "..");             map.put(')', "-.--.-");
            map.put('i', "-.-");            map.put('"', ".-..-.");
            map.put('j', ".-..");
            map.put('k', "--");
            map.put('l', "-.");
            map.put('m', "----");
            map.put('n', ".--.");
            map.put('o', ".-.");
            map.put('p', "...");
            map.put('q', "-");
            map.put('r', "..-");
            map.put('s', "..-.");
            map.put('t', "....");
            map.put('u', "-.-.");
            map.put('v', "----");
            map.put('w', "--.-");
            map.put('x', "-..-");
            map.put('y', "-.--");
            map.put('z', "-..-");
            map.put(' ', "|");

            // Заглавные буквы ENG

            map.put('A', ".-");
            map.put('B', ".--");
            map.put('C', "--.");
            map.put('D', "-..");
            map.put('E', ".");
            map.put('F', "...-");
            map.put('G', "--..");
            map.put('H', "..");
            map.put('I', "-.-");
            map.put('J', ".-..");
            map.put('K', "--");
            map.put('L', "-.");
            map.put('M', "----");
            map.put('N', ".--.");
            map.put('O', ".-.");
            map.put('P', "...");
            map.put('Q', "-");
            map.put('R', "..-");
            map.put('S', "..-.");
            map.put('T', "....");
            map.put('U', "-.-.");
            map.put('V', "----");
            map.put('W', "--.-");
            map.put('X', "..-..");
            map.put('W', "..--");
            map.put('Z', "-...");

        }

      public static Map<Character, String> getMap() {
        CodeMortheMap codeMortheMap = new CodeMortheMap();
        return map;
      }
    }

