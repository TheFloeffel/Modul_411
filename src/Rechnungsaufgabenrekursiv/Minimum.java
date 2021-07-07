package Rechnungsaufgabenrekursiv;

public class Minimum {

    public int berechnen (int[] list) {

        if (list.length < 2) {
            return list[0];
        }else {

            int[] listshort = new int[list.length -1];

            for (int i = 0 ; i < list.length - 1 ; i++) {

                listshort[i] = list[i];

            }

            return Math.min(list[list.length -1],berechnen(listshort));
        }

    }

}
