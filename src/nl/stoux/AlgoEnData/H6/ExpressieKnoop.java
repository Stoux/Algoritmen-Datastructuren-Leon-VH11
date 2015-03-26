package nl.stoux.AlgoEnData.H6;

import lombok.Getter;
import lombok.Setter;

import java.util.function.BiFunction;

/**
 * Created by Stoux on 27/03/2015.
 */

import static nl.stoux.AlgoEnData.Util.p;

@Getter @Setter
public class ExpressieKnoop implements Knoop {

    private final BiFunction<Integer, Integer, Integer> function;
    private Knoop left;
    private Knoop right;

    public ExpressieKnoop(BiFunction<Integer, Integer, Integer> function, Knoop left, Knoop right) {
        this.function = function;
        this.left = left;
        this.right = right;
    }

    @Override
    public int calculate() {
        int l = left.calculate();
        int r = right.calculate();
        int res = function.apply(l, r);
        p("L: " + l + " | R: " + r + " | Res: " + res);
        return res;
    }

    @Override
    public int getDepth() {
        int l = left.getDepth();
        int r = right.getDepth();
        return 1 + (l > r ? l : r);
    }
}
