package SelectionSort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListSortTest {

    ListSort LS1 = new ListSort();

    int[] listnormal = {12, 9, 13, 27, 58, 33, 25, 14, 40, 70, 89, 73};
    int[] expectednormal = {9, 12, 13, 14, 25, 27, 33, 40, 58, 70, 73, 89};

    int[] listdouble = {12, 9, 13, 27, 58, 27, 25, 14, 40, 27, 89, 73};
    int[] expecteddouble = {9, 12, 13, 14, 25, 27, 27, 27, 40, 58, 73, 89};

    // Test for List without duplicate entries
    @Test
    public void sortnormal() {



        assertArrayEquals(expectednormal, LS1.sort(listnormal));

    }

    // Test with two identical numbers in List
    @Test
    public void sortsame() {



        assertArrayEquals(expecteddouble, LS1.sort(listdouble));

    }

}