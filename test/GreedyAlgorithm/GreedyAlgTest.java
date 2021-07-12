package GreedyAlgorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class GreedyAlgTest {

    @Test
    public void run() {

        Gegenstand A = new Gegenstand("A",4.5);
        Gegenstand B = new Gegenstand("B",1.0);
        Gegenstand C = new Gegenstand("C",5.5);
        Gegenstand D = new Gegenstand("D",7.0);
        Gegenstand E = new Gegenstand("E",3.5);
        Gegenstand F = new Gegenstand("F",6.0);

        Gegenstand[] gegenstaende = {A,B,C,D,E,F};

        Arrays.sort(gegenstaende, Collections.reverseOrder());

        GreedyAlg G1 = new GreedyAlg();

        Gegenstand[] expected = {D,F,C,B,null,null};

        assertArrayEquals(expected, G1.run(gegenstaende));

    }

    @Test
    public void run20() {

        Gegenstand A = new Gegenstand("A",4.5);
        Gegenstand B = new Gegenstand("B",1.0);
        Gegenstand C = new Gegenstand("C",5.5);
        Gegenstand D = new Gegenstand("D",20.0);
        Gegenstand E = new Gegenstand("E",3.5);
        Gegenstand F = new Gegenstand("F",6.0);

        Gegenstand[] gegenstaende = {A,B,C,D,E,F};

        Arrays.sort(gegenstaende, Collections.reverseOrder());

        GreedyAlg G1 = new GreedyAlg();

        Gegenstand[] expected = {D,null,null,null,null,null};

        assertArrayEquals(expected, G1.run(gegenstaende));

    }

    @Test
    public void run21() {

        Gegenstand A = new Gegenstand("A",4.5);
        Gegenstand B = new Gegenstand("B",1.0);
        Gegenstand C = new Gegenstand("C",5.5);
        Gegenstand D = new Gegenstand("D",21.0);
        Gegenstand E = new Gegenstand("E",3.5);
        Gegenstand F = new Gegenstand("F",6.0);

        Gegenstand[] gegenstaende = {A,B,C,D,E,F};

        Arrays.sort(gegenstaende, Collections.reverseOrder());

        GreedyAlg G1 = new GreedyAlg();

        Gegenstand[] expected = {F,C,A,E,null,null};

        assertArrayEquals(expected, G1.run(gegenstaende));

    }

}