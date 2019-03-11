package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {

    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        // TODO Revisar

        System.out.println(Arrays.asList(input));
        System.out.println(Arrays.asList(squaredValues));
        System.out.println(Arrays.asList(squareAnArray(input)));
        Boolean flag = null;
        for (int i = 0; i < input.length; i++) {
            flag = true;
            for (int j = 0; j < squaredValues.length; j++) {
                if ( ( input[i] * input[i] ) == squaredValues[j] ){
                    flag = true;
                }
            }
        }
        System.out.println(flag);
        return null;
    }

    public static Integer[] squareAnArray(Integer[] input){
        for (int i = 0; i < input.length; i++) {
            input[i] = (int) Math.pow(input[i],2);
        }
        return input;
    }

//    public static compareElementInTwoArray()


}
