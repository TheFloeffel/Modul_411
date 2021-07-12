package LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList L1 = new LinkedList();

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

        System.out.println(L1.getLastNode().getValue());

        System.out.println(L1.getLength());

        System.out.println(L1.getNode(5));

        L1.outWholeList();

        System.out.println(L1.delete(11));

        L1.outWholeList();

        System.out.println(L1.delete(5));

        L1.outWholeList();

        //L1.delete(5);

        //L1.outWholeList();

        //L1.delete(10);

        //L1.outWholeList();

    }

}
