package nl.stoux.AlgoEnData.H1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static nl.stoux.AlgoEnData.Util.*;

/**
 * Created by Stoux on 08/02/2015.
 */
public class Opdracht7 {

    public int[] join(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        int ai = 0;
        int bi = 0;
        int ci = 0;

        while(ai < a.length) {
            int nr;
            if (bi >= b.length) {
                nr = a[ai++];
            } else {
                nr = (a[ai] < b[bi] ? a[ai++] : b[bi++]);
            }
            c[ci++] = nr;
        }

        while(bi < b.length) {
            c[ci++] = b[bi++];
        }

        return c;
    }

    public static void run() {
        int[] a = IntStream.range(50, 750).toArray();
        int[] b = IntStream.range(80, 600).toArray();
        int[] c = new Opdracht7().join(a, b);
        p(
                Arrays.stream(c).mapToObj(String::valueOf).collect(Collectors.joining(", "))
        );
    }

}
