package LB1;

// Aufgabe 2: Funktionalität: Dieses Programm wandelt eine ganze Dezimalzahl in Binärform mit 0-en und 1-en um.

public class Pseudocode {

    public String methodeB(int n) {

        String e = "";

        if (n == 1) {

            return "1";

        }else if (n == 0) {

            return "0";

        }else {

            e = methodeB((n/2));
            e = e + (n % 2);

            return e;

        }

    }

}
