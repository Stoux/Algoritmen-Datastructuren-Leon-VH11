package nl.stoux.AlgoEnData;

import nl.stoux.AlgoEnData.H2.Opdracht6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * Created by Stoux on 08/02/2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {

    }

    public static void readlines(Consumer<String> onLine) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            onLine.accept(line);
        }
    }


}
