package LB3;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.*;

public class TicketTest {

    Deque<Ticket> waitingList = new ArrayDeque<Ticket>();

    @Test
    public void run() {

        Ticket t1 = new Ticket(1,"Hans");
        waitingList.add(t1);

        System.out.println(waitingList);

        Ticket t2 = new Ticket(2,"Heidi");
        waitingList.add(t2);

        System.out.println(waitingList);

        Ticket t3 = new Ticket(3,"Petra");
        waitingList.add(t3);

        System.out.println(waitingList);

        waitingList.removeFirst();

        System.out.println(waitingList);

        waitingList.removeLast();

        System.out.println(waitingList);

        waitingList.removeFirst();

        System.out.println(waitingList);

        Ticket t4 = new Ticket(4,"Anna");
        waitingList.add(t4);

        System.out.println(waitingList);

        Ticket t5 = new Ticket(5,"Paul");
        waitingList.add(t5);

        System.out.println(waitingList);

        waitingList.removeLast();

        System.out.println(waitingList);

        Ticket t6 = new Ticket(6,"Tina");
        waitingList.add(t6);

        System.out.println(waitingList);

        waitingList.removeFirst();

        System.out.println(waitingList);

        waitingList.removeFirst();

        System.out.println(waitingList);


    }

}