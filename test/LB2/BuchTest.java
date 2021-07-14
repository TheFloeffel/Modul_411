package LB2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class BuchTest {

    Buch b1 = new Buch("DasABC","Mueller",25,2021);
    Buch b2 = new Buch("DasABC 2","Mueller",25,2022);
    Buch b3 = new Buch("DasABC 3","Mueller",25,2023);
    Buch b4 = new Buch("Zum scheitern bestimmt","Meier",25,2001);
    Buch b5 = new Buch("Zum scheitern bestimmt 2","Meier",25,2007);
    Buch b6 = new Buch("Zum scheitern bestimmt3","Meier",25,2010);
    Buch b7 = new Buch("Das Wiesel und Ich","Angst",25,2021);
    Buch b8 = new Buch("Das machst du toll","Angst",25,2022);

    Buch[] buecher = {b1,b2,b3,b4,b5,b6,b7,b8};
    Buch[] expected = {b8,b7,b6,b5,b4,b3,b2,b1};

    @Test
    public void compareTo() {

        Arrays.sort(buecher);

        assertArrayEquals(expected,buecher);

    }
}