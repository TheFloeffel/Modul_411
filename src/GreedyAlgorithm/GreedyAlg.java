package GreedyAlgorithm;

public class GreedyAlg {

    double sum = 0;

    public Gegenstand[] run(Gegenstand[] gegenstaende) {

        Gegenstand[] res = new Gegenstand[gegenstaende.length];
        int pointerres = 0;
        double tempsum = 0;

        for (int i = 0 ; i < gegenstaende.length ; i++) {

            tempsum = sum + gegenstaende[i].getWeight();

            if (tempsum <= 20) {

                sum = sum + gegenstaende[i].getWeight();

                res[pointerres] = gegenstaende[i];
                pointerres++;

            }

        }

        return res;

    }

}