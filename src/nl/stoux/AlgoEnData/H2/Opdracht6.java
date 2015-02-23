package nl.stoux.AlgoEnData.H2;

import java.util.Arrays;

/**
 * Created by Stoux on 24/02/2015.
 */
public class Opdracht6 {

    public int find(int[] list, int find) {
        int pos = list.length / 2;
        int found = list[pos];
        if (found == find) {
            return pos;
        }

        int from = 0;
        int to = 0;
        int used = 0;

        if (found > find) {
            to = pos;
        } else {
            from = pos;
            to = list.length;
            used = pos;
        }

        int[] subList = Arrays.copyOfRange(list, from, to);
        int foundPos = find(subList, find);
        return used + foundPos;
    }


}
