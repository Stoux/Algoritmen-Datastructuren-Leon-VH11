package nl.stoux.AlgoEnData.H6;

import java.util.function.BiFunction;
import static nl.stoux.AlgoEnData.Util.*;

/**
 * Created by Stoux on 27/03/2015.
 */
public class Main {

    public static final BiFunction<Integer, Integer, Integer> ADD = (i1, i2) -> i1 + i2;
    public static final BiFunction<Integer, Integer, Integer> MIN = (i1, i2) -> i1 - i2;
    public static final BiFunction<Integer, Integer, Integer> MUL = (i1, i2) -> i1 * i2;
    public static final BiFunction<Integer, Integer, Integer> DIV = (i1, i2) -> i1 / i2;

    /*
     *
     *                *
     *             -     +
     *           /  5  5  *
     *        10  5      5 10
     *
     *        -165
     *
     */

    private static Knoop getTree() {
        return new ExpressieKnoop(MUL,
                new ExpressieKnoop(MIN,
                        new ExpressieKnoop(DIV, new Blad(10), new Blad(5)),
                        new Blad(5)
                ),
                new ExpressieKnoop(ADD,
                        new Blad(5),
                        new ExpressieKnoop(MUL,
                                new Blad(5),
                                new ExpressieKnoop(ADD, new Blad(5), new Blad(5))
                        )
                )

        );
    }

    public static void main(String[] args) {
        o2();
        p("");
        o3();
    }

    public static void o2() {
        p("Value: " + getTree().calculate());
    }

    public static void o3() {
        p("Depth: " + getTree().getDepth());
    }


}
