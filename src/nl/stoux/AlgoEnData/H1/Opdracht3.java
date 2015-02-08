package nl.stoux.AlgoEnData.H1;

import java.util.stream.IntStream;

/**
 * Created by Stoux on 08/02/2015.
 */
public class Opdracht3 {

    public void search(){
        //Range of numbers
        int[] range = IntStream.range(0, 10000).toArray();
        int searchingFor = 330;

        //Get the length of the array
        int searchFrom = 0;
        int searchTo = range.length;

        int tries = 0;
        while (true) {
            tries++;
            int position = ((searchTo - searchFrom) / 2) + searchFrom;
            int found = range[position];
            if (found == searchingFor) {
                break; //Found it!
            } else if (found < searchingFor) {
                //Need to look on a higher position
                searchFrom = position;
            } else {
                //Need to look lower
                searchTo = position;
            }
        }

        System.out.println("Found it after " + tries + " tries!");
    }

}
