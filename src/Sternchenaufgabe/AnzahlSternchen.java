package Sternchenaufgabe;

import java.util.Scanner;

public class AnzahlSternchen {

    Scanner input = new Scanner(System.in);
    int anzahlReihen;
    boolean zweiSterne = false;

    public void drawSternchen () {

        System.out.println("Gib bitte eine Zahl ein:");

        anzahlReihen = input.nextInt();

        for (int i = 0 ; i < anzahlReihen ; i++) {

            if (i != 1) {
                zweiSterne = true;
            }

            int sternPosi = anzahlReihen - i;

            for (int j = 1 ; j <= (sternPosi) ; j++) {

                if (j != sternPosi) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            if (zweiSterne) {

                for (int k = 1 ; k <= (i * 2) ; k++) {

                    if (k < (i*2)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }

                }

            }

            System.out.println("");

        }

        //Ab Mitte

        int anzahlReihenUnten = anzahlReihen - 1;
        zweiSterne = true;

        for (int i = 1 ; i <= anzahlReihenUnten ; i++) {

            if (i == anzahlReihenUnten) {
                zweiSterne = false;
            }

            int sternPosi = i + 1;

            for (int j = 1 ; j <= (sternPosi) ; j++) {

                if (j != sternPosi) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            if (zweiSterne) {

                for (int k = sternPosi + 1 ; k <= ((anzahlReihenUnten * 2) - i + 1) ; k++) {

                    if (k < ((anzahlReihenUnten * 2) - i + 1)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }

                }

            }

            System.out.println("");

        }


    }

}
