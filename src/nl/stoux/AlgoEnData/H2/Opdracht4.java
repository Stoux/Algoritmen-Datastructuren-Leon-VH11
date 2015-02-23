package nl.stoux.AlgoEnData.H2;

import java.util.stream.IntStream;

/**
 * For loop is sneller aangezien er niet elke keer een nieuwe method hoeft aangeroepen te worden.
 */
public class Opdracht4 {


    public long fiboRec(int n) {
        long first = 1, second = 1;
        //TODO
        return second;
    }

    public long fiboFor(int n) {
        long first = 1, second = 1;
        int current = 2;
        while (current < n) {
            long temp = first;
            first = second;
            second = first + temp;
            current++;
        }
        return second;
    }

}
