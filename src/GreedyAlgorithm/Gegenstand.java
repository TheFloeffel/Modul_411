package GreedyAlgorithm;

public class Gegenstand implements Comparable<Gegenstand> {

    private String description;
    private double weight;

    public Gegenstand(String description, double weight) {
        this.description = description;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Gegenstand{" +
                "description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Gegenstand gegenstand) {
        if (this.weight < gegenstand.weight) {

            return -1;

        }else if (this.weight > gegenstand.weight) {

            return 1;

        }else {

            return 0;

        }



    }

}
