package nl.stoux.AlgoEnData.H3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static nl.stoux.AlgoEnData.Util.*;

/**
 * Created by Stoux on 24/02/2015.
 */
public class Opdracht3 {

    public static void run() {
        Polygoom p1 = new Polygoom();
        p1.add(new Term(1, 2), new Term(3, 1), new Term(1, 0));
        p(p1);

        Polygoom p2 = new Polygoom();
        p2.add(new Term(-1, 3), new Term(2, 2), new Term(-5, 0));
        p(p2);

        //Add to first
        p1.add(p2);
        p(p1);
    }


    private static class Term {

        int coeff;
        int exponent;

        public Term(int coeff, int exponent) {
            this.coeff = coeff;
            this.exponent = exponent;
        }

        @Override
        public String toString() {
            return coeff + "x^" + exponent;
        }
    }

    private static class Polygoom {

        private List<Term> terms;

        private Polygoom() {
            terms = new ArrayList<>();
        }

        public void add(Term... terms) {
            for (Term term : terms) {
                this.terms.add(term);
            }
        }

        public void add(Polygoom o) {
            //Duidelijk de beste manier om dit te doen.
            o.terms.forEach(ot -> {
                boolean found = false;
                for (Term t : terms) {
                    if (ot.exponent == t.exponent) {
                        t.coeff = t.coeff + ot.coeff;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    terms.add(ot);
                }
            });


        }

        @Override
        public String toString() {
            return "[" + terms.stream().map(Term::toString).collect(Collectors.joining(", ")) + "]";
        }
    }


}
