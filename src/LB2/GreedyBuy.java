package LB2;

import java.util.Arrays;
import java.util.Collections;

public class GreedyBuy {

    public double[] sort(double[] arr) {

        Arrays.sort(arr);

        double[] result = new double[arr.length];

        int poscount = 0;

        for (int i = arr.length - 1 ; i >= 0 ; i--) {

            result[poscount] = arr[i];

            poscount++;

        }

        return result;
    }

    public double[] run(double[] arr) {

        int countarr = 0;
        int countres = 0;

        double sum = 0;

        double[] result = new double[arr.length];

        while (countarr < arr.length) {

            if (sum + arr[countarr] <= 20) {
                result[countres]= arr[countarr];
                sum = sum + arr[countarr];
                countres++;
            }

            countarr++;

        }

        return result;

    }

}
