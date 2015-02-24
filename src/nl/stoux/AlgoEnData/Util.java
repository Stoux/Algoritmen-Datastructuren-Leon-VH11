package nl.stoux.AlgoEnData;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Stoux on 08/02/2015.
 */
public class Util {

    public static <T1 extends Object> TimedResult<T1> timed(Supplier<T1> run) {
        long startTime = System.currentTimeMillis();
        T1 result = run.get();
        long tookTime = System.currentTimeMillis() - startTime;
        return new TimedResult<T1>(tookTime, result);
    }

    public static void p(Object message) {
        System.out.println((message == null ? "null" : message.toString()));
    }

    public static class TimedResult<T1> {
        public long time;
        public T1 result;

        public TimedResult(long time, T1 result) {
            this.time = time;
            this.result = result;
        }
    }

}
