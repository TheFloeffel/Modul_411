package Rechnungsaufgabenrekursiv;

public class Fakultaet {

    public long berechnen (int zahl) {

        if (zahl == 0) {
            return 1;
        }else {
            return (zahl * (berechnen(zahl-1)));
        }

    }
}
