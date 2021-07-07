package Rechnungsaufgaben;

public class MinMax {

    public int[] berechnen() {

        ZahlenListe Z1 = new ZahlenListe();
        int[] zahlenArray = Z1.setList();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println(java.util.Arrays.toString(zahlenArray));

        for (int tempZahl : zahlenArray) {

            if (tempZahl <= min) {
                min = tempZahl;
            }

            if (tempZahl >= max) {
                max = tempZahl;
            }

        }

        System.out.println("Die grösste Zahl ist " + max);
        System.out.println("Die kleinste Zahl ist " + min);

        return new int[] {min, max};

    }

}
