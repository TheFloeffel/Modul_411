package MergeSort;

import java.util.Arrays;

public class mergeSort {

    public int[] sortArray(int[] list) {

        int[] lefthalf, righthalf;

        if (list.length > 1) {

            lefthalf = sortArray(Arrays.copyOfRange(list, 0, (list.length / 2)));
            righthalf = sortArray(Arrays.copyOfRange(list, list.length / 2, list.length));

        } else {
            return list;
        }

        int pointerleft = 0;
        int pointerright = 0;
        int pointerlist = 0;

        while (pointerleft < lefthalf.length || pointerright < righthalf.length) {

            if (pointerleft >= lefthalf.length) {

                list[pointerlist] = righthalf[pointerright];
                pointerright++;

            } else if (pointerright >= righthalf.length) {

                list[pointerlist] = lefthalf[pointerleft];
                pointerleft++;

            } else if (pointerleft < lefthalf.length && pointerright < righthalf.length) {

                if (lefthalf[pointerleft] < righthalf[pointerright]) {

                    list[pointerlist] = lefthalf[pointerleft];
                    pointerleft++;

                }else {

                    list[pointerlist] = righthalf[pointerright];
                    pointerright++;

                }

            }else {

                return list;

            }

            pointerlist++;

        }

        return list;

    }

}
