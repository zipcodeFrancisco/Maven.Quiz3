package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        Integer numberOfSpaces = str.length() - str.replaceAll(" ", "").length();
        Character[] step1 = splitAndLower( str );
        Character[] copy = step1.clone();

        String s = "";
        String[] strings = new String[step1.length];

        for (int i = 0; i < step1.length; i++) {

            if( step1[i] != "_".charAt(0) || step1[i] != "!".charAt(0) ) {
                copy = step1.clone();
                copy[i] = step1[i].toString().toUpperCase().charAt(0);
                strings[i] = String.copyValueOf(castingChars(copy));
//                System.out.println(Arrays.asList(strings));
            }
        }
        strings = Arrays.stream(strings)
                .filter(ss -> (ss != null && ss.length() > 0))
                .toArray(String[]::new);

        return strings;
    }

    public static char[] castingChars(Character[] characters){
        char[] copy = new char[characters.length];
        for (int i = 0; i < characters.length; i++) {
            copy[i] = characters[i];
        }
        return copy;
    }

    public static Character[] splitAndLower(String str){
        Character[] charObjectArray = str.toLowerCase().chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        return charObjectArray;
    }


}
