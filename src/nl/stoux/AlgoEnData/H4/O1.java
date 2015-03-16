package nl.stoux.AlgoEnData.H4;

import static nl.stoux.AlgoEnData.Util.*;

/**
 * Created by Stoux on 03/03/2015.
 */
public class O1 {

    public static void main(String[] args) {
        Integer[][] arr = new Integer[][] {
                new Integer[]{1, 2, 3},
                new Integer[]{-1,5,100},
                new Integer[]{-40, 300}
        };
        p(maxRowSum(arr));
    }

    public static <E extends Number> double maxRowSum(E[][] array) {
        double biggest = Double.MIN_VALUE;
        for (E[] es : array) {
            double current = 0;
            for (E e : es) {
                current += e.doubleValue();
            }
            if (current > biggest) {
                biggest = current;
            }
        }
        return biggest;
    }


}
