package SelectionSort;

public class ListSort {

    public int[] sort (int[] list) {

        int[] arr = list;

        int temp;

        for (int i = 0 ; i < arr.length ; i++) {

            for (int t = i + 1 ; t < arr.length ; t++) {

                if (arr[t] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[t];
                    arr[t] = temp;
                }

            }

        }

        System.out.println(java.util.Arrays.toString(arr));

        return arr;

    }

}
