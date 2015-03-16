package nl.stoux.AlgoEnData.H4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import static nl.stoux.AlgoEnData.Util.p;

/**
 * Created by Stoux on 16/03/2015.
 */
public class O6 {

    private List<String> woorden;

    public O6() throws Exception {
        woorden = read();
    }

    public static void main(String[] args) throws Exception{
        O6 galgje = new O6();
        while (!galgje.isEmpty()) {
            p("Woord: " + galgje.getAndRemove());
        }
    }

    public static List<String> read() throws Exception {
        return Files.readAllLines(Paths.get("galgje.txt"));
    }

    public boolean isEmpty() {
        return woorden.isEmpty();
    }

    public String getAndRemove() {
        return woorden.remove(new Random().nextInt(woorden.size()));
    }

}
