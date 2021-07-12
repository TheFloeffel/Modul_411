package LB1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromTest {

    // Test iterative Check --> true
    @Test
    public void checkIterativeTrue() {

        CheckPalindrom I1 = new CheckPalindrom();

        char[] wordarr = {'A','B','B','A'};

        assertTrue(I1.checkiterative(wordarr));

    }

    // Test iterative Check --> false
    @Test
    public void checkIterativeFalse() {

        CheckPalindrom I1 = new CheckPalindrom();

        char[] wordarr = {'A','C','B','A'};

        assertFalse(I1.checkiterative(wordarr));

    }

    // Test iterative Check mit Anfangsbuchstabe gross --> false
    @Test
    public void checkIterativeFalseGK() {

        CheckPalindrom I1 = new CheckPalindrom();

        char[] wordarr = {'L','a','g','e','r','r','e','g','a','l'};

        assertFalse(I1.checkiterative(wordarr));

    }

    // Test iterative Check Anzahl Buchstaben ungerade --> true
    @Test
    public void checkIterativeTrueUnevenLength() {

        CheckPalindrom I1 = new CheckPalindrom();

        char[] wordarr = {'N','E','B','E','N'};

        assertTrue(I1.checkiterative(wordarr));

    }

    // Test iterative Check Anzahl Buchstaben ungerade --> false
    @Test
    public void checkIterativeFalseUnevenLength() {

        CheckPalindrom I1 = new CheckPalindrom();

        char[] wordarr = {'N','E','B','S','N'};

        assertFalse(I1.checkiterative(wordarr));

    }

    // Test recursive Check --> true
    @Test
    public void checkRecursiveTrue() {

        CheckPalindrom I1 = new CheckPalindrom();

        char[] wordarr = {'A','D','B','A'};

        assertTrue(I1.checkrecursive(wordarr,0,3));

    }

    // Test recursive Check --> false
    @Test
    public void checkRecursiveFalse() {

        CheckPalindrom I1 = new CheckPalindrom();

        char[] wordarr = {'A','C','B','A'};

        assertFalse(I1.checkrecursive(wordarr,0,3));

    }

    // Test recursive Check Anzahl Buchstaben ungerade --> true
    @Test
    public void checkRecursiveTrueUnevenLength() {

        CheckPalindrom I1 = new CheckPalindrom();

        char[] wordarr = {'N','E','B','E','N'};

        assertTrue(I1.checkrecursive(wordarr,0,4));

    }

    // Test recursive Check Anzahl Buchstaben ungerade --> false
    @Test
    public void checkRecursiveFalseUnevenLength() {

        CheckPalindrom I1 = new CheckPalindrom();

        char[] wordarr = {'N','E','B','S','N'};

        assertFalse(I1.checkrecursive(wordarr,0,4));

    }

    // Test recursive Check mit Anfangsbuchstabe gross --> false
    @Test
    public void checkRecursiveFalseGK() {

        CheckPalindrom I1 = new CheckPalindrom();

        char[] wordarr = {'L','a','g','e','r','r','e','g','a','l'};

        assertFalse(I1.checkrecursive(wordarr,0,9));

    }

}