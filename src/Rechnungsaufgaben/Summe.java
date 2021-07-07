package Rechnungsaufgaben;

import java.util.Scanner;

public class Summe {

    int resultat = 0;

    public int berechnen (int zahl) {

        for (int i = 1 ; i <= zahl ; i++) {

            resultat = resultat + i;

        }

        return resultat;

    }


}
