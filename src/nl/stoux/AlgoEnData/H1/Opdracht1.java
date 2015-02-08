package nl.stoux.AlgoEnData.H1;

import java.util.function.Supplier;

import static nl.stoux.AlgoEnData.Util.*;

/**
 * Created by Stoux on 08/02/2015.
 */
public class Opdracht1 {

    /*
     * Voor elke 1 actie. Dus gelijk aan de size van n
     * O(n)
     */
    public long a() {
        long som = 0;
        int n = 10000;
        for (int i = 0; i < n; i++) {
            som++;
        }
        return som;
    }

    /*
     * Voor elke actie, n keer de actie.
     * n * n, dus O(n²)
     */
    public long b() {
        long som = 0;
        int n = 10000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                som++;
            }
        }
        return som;
    }

    /*
     * Voor elke n moet n * n (dus n²) worden doorlopen
     * Dit komt tot n * n * n dus n³
     * O(n³)
     */
    public long c() {
        long som = 0;
        int n = 1000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * n; j++) {
                som++;
            }
        }
        return som;
    }

    /*
     * Voor elke n moet een actie worden gedaan -> n
     * Er moet voor elke n, i keer die actie worden gedaan. Door het gemiddelde te nemen krijg je dan n * 0.5
     * Omdat je de eerste iteratie mist (vanwege i = 0) krijg je n-1
     * Levert dan op O((n-1) * n * 0.5)
     */
    public long d(){
        long som = 0;
        int n = 1000;
        for (int i = 0; i < n; i++) { //N
            for (int j = 0; j < i; j++) { //* (0.5 * N)
                som++;
            }
        }
        return som;
    }

    private void getResult(String msg, Supplier<Long> function) {
        p(msg);
        long tookTime = 0;
        long result = 0;
        for (int i = 0; i < 1000; i++) {
            TimedResult<Long> r = timed(function);
            tookTime += r.time;
            result = r.result;
            rp(i);
        }
        p("");
        p("Result: " + result + " | Took: " + (tookTime / 1000));
        p("");
    }

    public static void rp(int nr) {
        System.out.print("\r" + nr);
    }

    public void runAll() {
        getResult("A", this::a);
        getResult("B", this::b);
        getResult("C", this::c);
        getResult("D", this::d);
    }




}
