package LB3;

import java.util.ArrayDeque;
import java.util.Deque;

public class TicketTest {

    public static void main(String[] args) {

        Deque<Ticket> waitingList = new ArrayDeque<Ticket>();

        Ticket t1 = new Ticket(1,"Hans");
        waitingList.add(t1);

        Ticket t2 = new Ticket(2,"Heidi");
        waitingList.add(t2);

        Ticket t3 = new Ticket(3,"Petra");
        waitingList.add(t3);

        System.out.println(getNext(waitingList));

        waitingList.removeFirst();

        System.out.println(getNext(waitingList));

        waitingList.removeLast();

        System.out.println(getNext(waitingList));

        waitingList.removeFirst();

        System.out.println(getNext(waitingList));

        Ticket t4 = new Ticket(4,"Anna");
        waitingList.add(t4);

        System.out.println(getNext(waitingList));

        Ticket t5 = new Ticket(5,"Paul");
        waitingList.add(t5);

        System.out.println(getNext(waitingList));

        waitingList.removeLast();

        Ticket t6 = new Ticket(6,"Tina");
        waitingList.add(t6);

        System.out.println(getNext(waitingList));

        waitingList.removeFirst();

        System.out.println(getNext(waitingList));

        waitingList.removeFirst();

        System.out.println(getNext(waitingList));

        if (isEmpty(waitingList) == true) {

            System.out.println("Es wurde niemand vergessen.");

        }else {
            System.out.println("Es warten immernoch Leute!");
        }

    }

    public static boolean isEmpty(Deque<Ticket> t) {

        Object[] arr = t.toArray();

        if (arr.length < 1) {
            return true;
        }else {
            return false;
        }

    }

    public static int getNext(Deque<Ticket> t) {

        return t.peekFirst().getTicketnumber();

    }

}
