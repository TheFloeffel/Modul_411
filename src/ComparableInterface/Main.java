package ComparableInterface;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person ("Muster", "Anna");
        Person p2 = new Person ("Albrecht", "Laura");

        System.out.println(p1.compareTo(p2));

    }

}
