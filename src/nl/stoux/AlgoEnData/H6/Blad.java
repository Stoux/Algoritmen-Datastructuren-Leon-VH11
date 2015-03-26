package nl.stoux.AlgoEnData.H6;

/**
 * Created by Stoux on 27/03/2015.
 */
public class Blad implements Knoop {

    private int value;

    public Blad(int value) {
        this.value = value;
    }

    @Override
    public int calculate() {
        return value;
    }

    @Override
    public int getDepth() {
        return 1;
    }
}
