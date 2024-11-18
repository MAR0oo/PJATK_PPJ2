package GUI03_home.zad7;

public abstract class ACarnivore extends AAnimal {

    public ACarnivore(String name, Group group) {
        super(name, group);
    }

    public abstract boolean isScravenger();

}
