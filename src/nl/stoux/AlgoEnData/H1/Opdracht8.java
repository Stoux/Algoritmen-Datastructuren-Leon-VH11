package nl.stoux.AlgoEnData.H1;

import nl.stoux.AlgoEnData.Util;

/**
 * Created by Stoux on 08/02/2015.
 */
public class Opdracht8 {


    public void edgySquare(int n) {
        //Create the square
        Integer[][] square = new Integer[n][];
        for (int i = 0; i < n; i++) {
            square[i] = new Integer[n];
        }

        //Initial data
        int nr = 1;
        int x = ((n + 1) / 2) - 1;
        int y = n - 1;

        //Loop through square
        while(nr <= (n * n)) {
            //Copy data to return to
            int oldX = x;
            int oldY = y;

            //Set number and increment
            square[y++][x++] = nr++;

            //Check if outside matrix
            if (x > n - 1) {
                x = 0;
            }
            if (y > n -1 ) {
                y = 0;
            }

            //Already filled in, go back to old position - 1Y
            if (square[y][x] != null) {
                x = oldX;
                y = oldY - 1;

                //If still not null -> done
                if (y < 0) {
                    break;
                }
            }
        }

        int length = String.valueOf(n * n).length() + 1;

        for (int i = square.length - 1; i >= 0; i--) {
            Integer[] xArr = square[i];
            for (Integer integer : xArr) {
                System.out.print(toString(integer, length) + " ");
            }
            System.out.println();
        }
    }

    public String toString(int value, int length) {
        return String.format("%1$"+length+ "s", String.valueOf(value));
    }

}
