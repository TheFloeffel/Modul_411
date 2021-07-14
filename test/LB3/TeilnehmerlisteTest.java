package LB3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeilnehmerlisteTest {

    Teilnehmer t1 = new Teilnehmer("Hansler","Heinz");
    Teilnehmer t2 = new Teilnehmer("Zuber","Matthias");
    Teilnehmer t3 = new Teilnehmer("Meier","Gustav");
    Teilnehmer t4 = new Teilnehmer("Reber","Maja");
    Teilnehmer t5 = new Teilnehmer("Eberhard","Siegfried");

    @Test
    public void isEmpty() {

        Teilnehmerliste tl1 = new Teilnehmerliste();

        assertTrue(tl1.isEmpty());

        tl1.add(t1);

        assertFalse(tl1.isEmpty());

    }

    @Test
    public void indexOf() {

        Teilnehmerliste tl1 = new Teilnehmerliste();
        tl1.add(t1);
        tl1.add(t2);
        tl1.add(t3);
        tl1.add(t4);

        assertEquals(0,tl1.indexOf(t1));
        assertEquals(3,tl1.indexOf(t4));
        assertEquals(-1,tl1.indexOf(t5));


    }

    @Test
    public void removeLast() {

        Teilnehmerliste tl1 = new Teilnehmerliste();
// List empty
        assertFalse(tl1.removeLast());

        tl1.add(t1);
        tl1.add(t2);
        tl1.add(t3);
        tl1.add(t4);
// List with 4 entries
       assertTrue(tl1.removeLast());

    }

    @Test
    public void reverse() {

        Teilnehmerliste tl1 = new Teilnehmerliste();
        tl1.add(t1);
        tl1.add(t2);
        tl1.add(t3);
        tl1.add(t4);

        Teilnehmerliste expected = new Teilnehmerliste();
        expected.add(t4);
        expected.add(t3);
        expected.add(t2);
        expected.add(t1);



        assertEquals(expected.toString(),tl1.toString());

    }
}