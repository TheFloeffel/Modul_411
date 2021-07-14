package DemoArrayDeque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
    //Erstellen einer leeren ArrayDeque
        Deque<Integer> dq = new ArrayDeque<Integer>();
        Deque<Integer> dq2 = new ArrayDeque<Integer>();

    //Einträge einfügen
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);

        System.out.println("ArrayDeque: " + dq);

        dq.addFirst(00);

        System.out.println("ArrayDeque addFirst: " + dq);

        dq.addLast(60);

        System.out.println("ArrayDeque addLast: " + dq);


        System.out.println(dq.getFirst());
    // getFirst wirft eine Exception, wenn kein Element im Deque ist
    //    System.out.println(dq2.getFirst());

    // Wenn kein Element in der Deque ist, wird bei Peek Null zurückgegeben
        System.out.println(dq.peekFirst());
        System.out.println(dq2.peekFirst());

        System.out.println(dq.getLast());
        System.out.println(dq.peekLast());

        System.out.println("Removing Elements:");
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);

    //pop und poll löschen Elemente und geben diesen zurück. Poll gibt aber keinen Error zurück, falls die Deque leer ist
        System.out.println("removed: " + dq.pop());
        System.out.println("removed: " + dq2.pollLast());

        System.out.println(dq);

    //iterator und descending iterator ermöglicht das Iterieren von beiden Seiten der Deque
        for (Iterator itr = dq.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        for (Iterator itr = dq.descendingIterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);

        System.out.println(dq);
        dq.removeFirstOccurrence(20);
        System.out.println("Erste 20 removed: " + dq);

        dq.removeLastOccurrence(30);
        System.out.println("Letzte 30 removed: " + dq);

        System.out.println("Size: " + dq.size());

        System.out.println(Arrays.toString(dq.toArray()));

    }

}
