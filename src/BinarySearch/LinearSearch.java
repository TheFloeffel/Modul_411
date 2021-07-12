package BinarySearch;

public class LinearSearch {

    int index;

    public int search(int[] list, int num) {

        for (int i = 0 ; i < list.length ; i++) {

            if (list[i] == num) {
                index = i;
            }

        }

        return index;

    }

}
