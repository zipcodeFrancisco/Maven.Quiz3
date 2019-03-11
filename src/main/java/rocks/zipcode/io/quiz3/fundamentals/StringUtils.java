package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] chars = str.toCharArray();
        char upperCase = String.valueOf(chars[indexToCapitalize]).toUpperCase().charAt(0);
        chars[indexToCapitalize] = upperCase;
        return String.valueOf( chars );
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (baseString.indexOf(characterToCheckFor) == indexOfString ){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        String[] result = new String[]{};
        Integer c = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                result = Arrays.copyOf(result,c + 1);
                result[c] = string.substring( i, j + 1);
                c++;
            }
        }
        return result;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length - 1;
    }
}
