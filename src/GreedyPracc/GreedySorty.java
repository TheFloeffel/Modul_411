package GreedyPracc;

import java.util.Arrays;
import java.util.Collections;

public class GreedySorty {

    public Integer[] sort(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

}
