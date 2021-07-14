package LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList L1 = new LinkedList();

    @Before
    public void setUp() throws Exception {

        System.out.println("Setup");
        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.add(5);
        L1.add(6);
        L1.add(7);
        L1.add(8);
        L1.add(9);
        L1.add(10);

    }

    @After
    public void tearDown() throws Exception {
        L1.deleteAll(L1);
        System.out.println("Cleanup");
    }

    @Test
    public void getLastValue() {

        assertEquals(10,L1.getLastValue());

    }

    @Test
    public void add() {

        assertEquals(true,L1.add(7));

    }

    @Test
    public void delete() {

        assertEquals(true,L1.delete(5));
        assertEquals(true,L1.delete(10));
        assertEquals(true,L1.delete(1));

    }

    @Test
    public void getNode() {

        System.out.println(L1.getNode(10).getValue());

    }

    @Test
    public void getLength() {

        assertEquals(10,L1.getLength());

    }
}