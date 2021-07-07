package MergeSort;

public class Main {

    public static void main(String[] args) {

        mergeSort S1 = new mergeSort();

        int[] list = {12,5,7,12,9,22,25,21,8};

        int[] list2 = {12,5,7,12,27,9,22,25,21,8};

        System.out.println(java.util.Arrays.toString(S1.sortArray(list)));

        System.out.println(java.util.Arrays.toString(S1.sortArray(list2)));

    }

}
