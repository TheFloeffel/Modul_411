package GreedyPracc;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GreedyAlgTest {

    GreedySorty s1 = new GreedySorty();
    GreedyAlg a1 = new GreedyAlg();

    Integer[] arr = {5,20,25,7,1,4,5,88};

    Integer[] expected = {25,20,5,null,null,null,null,null};

    @Test
    public void run() {

        assertArrayEquals(expected,a1.run(s1.sort(arr)));

    }
}