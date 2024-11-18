package GUI03_home.zad7;

public abstract class AAnimal {
    private String name;
    private Group group;

    public AAnimal(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "AAnimal{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
