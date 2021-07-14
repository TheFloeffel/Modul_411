package LB2;

import ComparableInterface.Person;

import java.time.LocalDate;
import java.util.Date;

public class Buch implements Comparable<Buch> {

    private String titel;
    private String author;
    private int numPages;
    private Integer date;

    public Buch(String titel, String author, int numPages, Integer date) {
        this.titel = titel;
        this.author = author;
        this.numPages = numPages;
        this.date = date;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", author='" + author + '\'' +
                ", numPages=" + numPages +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(Buch b) {

        if (this.author.compareTo(b.getAuthor()) < 0) {
            if (this.date.compareTo(b.getDate()) > 0) {
                return 1;
            }else {
                return -1;
            }
        }else {
            if (this.date.compareTo(b.getDate()) > 0) {
                return 1;
            }else {
                return -1;
            }
        }

    }

}
