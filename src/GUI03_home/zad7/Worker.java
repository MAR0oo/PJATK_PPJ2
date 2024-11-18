package GUI03_home.zad7;

public class Worker {
    public String getName() {
        return name;
    }

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void cleanAnimal(AAnimal animal){

    }
    public void feedAnimal(AAnimal animal){

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }
}
