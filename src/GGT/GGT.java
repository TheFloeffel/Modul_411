package GGT;

public class GGT {

    public int berechnen(int a, int b) {

        if (a == b) {

            return a;

        }else {

            if (a > b) {

                return berechnen(a - b, b);

            }else if (a < b){

                return berechnen(a,b - a);

            }else {

                return 0;

            }

        }

    }

}
