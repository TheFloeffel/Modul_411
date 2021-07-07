package Rechnungsaufgaben;

import org.junit.Test;

import static org.junit.Assert.*;

public class FakultaetTest {

    private Fakultaet F1 = new Fakultaet();

    @Test
    public void berechnen() {

        assertEquals(3628800,F1.berechnen(10));

    }
}