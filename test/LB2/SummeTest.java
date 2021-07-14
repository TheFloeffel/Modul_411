package LB2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummeTest {

    Summe s1 = new Summe();

    @Test
    public void berechnen() {

        assertEquals(10,s1.berechnen(5,5));
        assertEquals(19,s1.berechnen(10,9));
        assertEquals(5,s1.berechnen(5,0));

    }
}