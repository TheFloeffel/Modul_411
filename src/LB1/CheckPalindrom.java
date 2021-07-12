package LB1;

public class CheckPalindrom {

    // methode iterativer check, ob Wort in Char Array ein Palindrom ist
    public boolean checkiterative (char[] wordarr) {

        int j = wordarr.length - 1;

        //iteration von beiden Seiten nach innen, bis sich die beiden Iterators treffen
        for (int i = 0 ; i < j ; i++) {

            if (wordarr[i] != wordarr[j]) {

                return false;

            }else {

                j--;

            }

        }

        return true;

    }

    // methode rekursiver check, ob Wort in Char Array ein Palindrom ist
    // i ist der Index und j ist der Index für den hintersten Eintrag des Wortes/Arrays
    public boolean checkrecursive (char[] wordarr,int i,int j) {

        // Methode gibt ein "true" zurück, wenn das "Wort" aus nur einem Buchstaben besteht,
        // oder der Index grösser ist als der Index des Ende des Wortes.
        if (i >= j) {

            return true;

        }

        if (wordarr[i] == wordarr[j]) {

            return checkrecursive(wordarr,i + 1,j - 1);

        } else {
            // gibt ein false zurück, wenn die sich gegenüberliegenden Buchstaben nicht gleich sind
            return false;

        }

    }


}
