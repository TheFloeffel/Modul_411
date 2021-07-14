package LB2;

public class Summe {

    public int berechnen(int a, int b) {

        if (b == 0) {

            return a;

        }else {

            return berechnen(a + 1,b - 1);

        }

    }

}
