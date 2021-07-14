package GreedyPracc;

public class GreedyAlg {

    public Integer[] run(Integer[] arr) {

        int countarr = 0;
        int countres = 0;

        int tempsum = 0;
        int sum = 0;

        Integer[] result = new Integer[arr.length];

        while (countarr < arr.length) {

            tempsum = sum + arr[countarr];

            if (tempsum <= 50) {
                result[countres]= arr[countarr];
                sum = sum + arr[countarr];
                countres++;
            }

            countarr++;

        }

        return result;

    }

}
