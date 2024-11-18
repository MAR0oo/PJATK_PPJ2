package GUI04_home.zad2;

public class Animal {
    private String name;
    private int weight, high, topSpeed;

    public Animal(String name, int weight, int high, int topSpeed) {
        this.name = name;
        this.weight = weight;
        this.high = high;
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Animal: " + name  +
                " waga: " + weight +
                " wzrost: " + high +
                " szybkosc: " + topSpeed;
    }
}
