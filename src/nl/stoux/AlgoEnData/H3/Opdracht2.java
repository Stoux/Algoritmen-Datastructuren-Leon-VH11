package nl.stoux.AlgoEnData.H3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Stoux on 24/02/2015.
 */
public class Opdracht2 {

    public static ArrayList<Integer> combine(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.addAll(l1);
        l3.addAll(l1);
        Collections.sort(l3);
        return l3;
    }

}



