package BinarySearch;

import java.util.Arrays;

public class BinarySearch {

    public int search(int[] list,int num) {

        int index;
        int[] half;

        Arrays.sort(list,0,list.length);

        System.out.println(java.util.Arrays.toString(list));

        if (num == list[list.length/2]) {

            index = list.length/2;

            return index;

        } else {

            if (num < list[list.length/2]) {

                half = Arrays.copyOfRange(list, 0, (list.length / 2));

                search(half,num);

            } else {

                half = Arrays.copyOfRange(list, (list.length / 2),0);

                search(half,num);

            }

        }

        return 0;

    }

}
