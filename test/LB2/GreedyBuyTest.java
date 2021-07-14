package LB2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class GreedyBuyTest {

    GreedyBuy gb1 = new GreedyBuy();



    private static final double delta = 1e-15;

// Array aus der Aufgabe 1
    @Test
    public void runFirstArray() {

        double[] preise = {1.80,1.50,3.50,3.0,6.50,4.50,2.00};
        double[] expected = {6.50,4.50,3.50,3.0,2.0,0.0,0.0};

        assertArrayEquals(expected,gb1.run(gb1.sort(preise)),delta);

    }

    // Array mit einer Zahl grösser als das Maximum
    @Test
    public void runBiggerMax() {

        double[] preise = {22.50,1.80,1.50,3.50,3.0,6.50,4.50,2.00};
        double[] expected = {6.50,4.50,3.50,3.0,2.0,0.0,0.0,0.0};

        assertArrayEquals(expected,gb1.run(gb1.sort(preise)),delta);

    }

    // Array mit einer Zahl genau gleich gross wie das Maximum am Anfang
    @Test
    public void runMax() {

        double[] preise = {20.0,1.80,1.50,3.50,3.0,6.50,4.50,2.00};
        double[] expected = {20.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};

        assertArrayEquals(expected,gb1.run(gb1.sort(preise)),delta);

    }

    @Test
    public void sort() {



    }

}