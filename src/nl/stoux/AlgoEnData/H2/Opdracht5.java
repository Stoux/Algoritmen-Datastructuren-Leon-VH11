package nl.stoux.AlgoEnData.H2;

/**
 * Created by Stoux on 23/02/2015.
 */
public class Opdracht5 {

    public boolean isPalindroom(String s) {
        int l = s.length();
        if (l == 1 || l == 0) {
            return true;
        }

        //Get chars
        char c1 = s.charAt(0);
        char c2 = s.charAt(l - 1);
        if (c1 != c2) {
            return false;
        }

        //Recursive!
        String sub = s.substring(1, l - 1);
        return isPalindroom(sub);
    }


}
