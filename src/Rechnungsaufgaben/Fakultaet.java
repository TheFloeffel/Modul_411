package Rechnungsaufgaben;

public class Fakultaet {

    long resultat = 1;

    public long berechnen (int zahl) {

        if (zahl > 0) {

             for (int i = 1; i <= zahl; i++) {

                 resultat = resultat * i;

             }


             System.out.println("Die Fakultaet von " + zahl + " ist " + resultat);
         } else {
             System.out.println("ERROR!!! NUMBER IS 0 or SMALLER");
         }

         return resultat;

    }

}
