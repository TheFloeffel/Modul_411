package BinarySearch;

public class Main {

    public static void main(String[] args) {

        int[] list = {6,7,12,1,19,5};

      //  LinearSearch L1 = new LinearSearch();
      //  System.out.println(L1.search(list,12));

        BinarySearch B1 = new BinarySearch();
        System.out.println(B1.search(list,15));

    }

}
