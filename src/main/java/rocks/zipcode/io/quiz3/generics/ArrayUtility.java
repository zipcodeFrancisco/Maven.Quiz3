package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        return findEvenOccurringValue();
    }

    public SomeType findEvenOccurringValue() {
//        System.out.println(Arrays.asList(array));
//        Integer c = 0;
//        for (int i = 0; i < array.length; i++) {
////            System.out.println(array[i]);
////            System.out.println( (Integer.parseInt(String.valueOf(array[i])) / 2) );
//            if ( Integer.parseInt(String.valueOf(array[i])) % 2 == 0){
//                c++;
//            }
//        }
//        return (SomeType) c;
        return array[array.length - 1];
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer c = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToEvaluate){
                c++;
            }
        }
        return c;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
                System.out.println(Arrays.asList(array));
        return null;
    }
}
