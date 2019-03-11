package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return null;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        System.out.println(word.substring(0,1));
        if(word.substring(0,1) == "A"
                || word.substring(0,1) == "E"
                || word.substring(0,1) == "I"
                || word.substring(0,1) == "O"
                || word.substring(0,1) == "U" ){
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if(character == 'a' || character == 'A'
                || character == 'e' || character == 'E'
                || character == 'i' || character == 'I'
                || character == 'o' || character == 'O'
                || character == 'u' || character == 'U'){
            return true;
        }
        return true;
    }
}
