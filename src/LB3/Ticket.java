package LB3;

public class Ticket {

    private int ticketnumber;
    private String name;

    public Ticket(int ticketnumber, String name) {
        this.ticketnumber = ticketnumber;
        this.name = name;
    }

    public int getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(int ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketnumber=" + ticketnumber +
                ", name='" + name + '\'' +
                '}';
    }
}
