package Rechnungsaufgaben;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ZahlenListe {

    Scanner input = new Scanner(System.in);

    int x;

    public int[] setList() {

        // lokale Variablen
        int zahl;

        System.out.println("Wie viele Zahlen willst du eingeben?");
        x = input.nextInt();

        int[] inputZahlenListe = new int[x];

        for (int i = 0 ; i < 5 ; i++) {

            System.out.println("Gib die " + (i+1) + ". Zahl ein:");
            zahl = input.nextInt();

            inputZahlenListe[i] = zahl;

        }

        return inputZahlenListe;

    }

}
