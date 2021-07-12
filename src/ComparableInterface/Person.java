package ComparableInterface;

public class Person implements Comparable<Person> {

    private String nachname;
    private String vorname;

    public Person(String nachname, String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String toString() {

        return "Person{" + "nachname='" + '\'' + '}';

    }

    @Override
    public int compareTo(Person p) {

        if (this.nachname.compareTo(p.getNachname()) <= 0 && this.vorname.compareTo(p.getVorname()) < 0) {

            return -1;

        }else {
            return 1;
        }

    }

}
