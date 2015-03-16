package nl.stoux.AlgoEnData.H4;

import static nl.stoux.AlgoEnData.Util.p;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Stoux on 16/03/2015.
 */
public class O7 {

    public static void main(String[] args) throws Exception{
        //Create a list
        LinkedList<Werknemer> werknemers = new LinkedList<>();
        werknemers.addAll(Arrays.asList(new Werknemer("A", 1), new Werknemer("B", 2), new Werknemer("C", 3)));

        //Copy the link
        LinkedList<Werknemer> copy1 = new LinkedList<>(werknemers);
        LinkedList<Werknemer> copy2 = (LinkedList<Werknemer>) werknemers.clone();

        //=> Check if ondiep
        p("Copy1 is ondiep: " + isOndiep(werknemers, copy1));
        p("Copy2 is ondiep: " + isOndiep(werknemers, copy2));

        //Create deep copy
        LinkedList<Werknemer> deep = copyDeep(werknemers);
        p("Deep is ondiep: " + isOndiep(werknemers, deep));
    }

    public static boolean isOndiep(LinkedList<Werknemer> origineel, LinkedList<Werknemer> copy) {
        return origineel.get(0) == copy.get(0);
    }

    public static LinkedList<Werknemer> copyDeep(LinkedList<Werknemer> origineel) throws Exception{
        final LinkedList<Werknemer> copy = new LinkedList<>();
        for (Werknemer werknemer : origineel) {
            copy.add(werknemer.copy());
        }
        return copy;
    }


    private static class Werknemer implements Cloneable {
        private String naam;
        private double salaris;

        public Werknemer(String naam, double salaris) {
            this.naam = naam;
            this.salaris = salaris;
        }

        protected Werknemer copy() throws CloneNotSupportedException {
            return (Werknemer) this.clone();
        }
    }

}
