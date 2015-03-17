package nl.stoux.AlgoEnData.H5;

import static nl.stoux.AlgoEnData.Util.p;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/**
 * Created by Stoux on 17/03/2015.
 */
public class O3 {

    public static void main(String[] args) {
        String[] x = {
                "public abstract class BaseVersusArenaGame<Handler extends BaseEventHandler, GP extends GamePlayer, GameSettings extends BaseVersusGameSettings, Arena extends BaseArena, ArenaState extends BaseArenaState<Arena, ? , ?>> extends BaseVersusGame<Handler, GP, GameSettings>",
                "<Wat><<<<Deze > is > best wel > vreemd >",
                "Hol<>>",
                "Lol <<<>>> <><><<Ayy > <<> Waat <<>>>>",
        };

        for (String s : x) {
            p(s);
            p("Balans: " + inBalans(s));
            p("");
        }

    }

    public static boolean inBalans(String t) {
        ArrayDeque<Character> d = new ArrayDeque<>();
        try {
            for (char c : t.toCharArray()) {
                if (c == '<') {
                    d.addLast(c);
                } else if (c == '>') {
                    d.removeLast();
                }
            }
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

}
