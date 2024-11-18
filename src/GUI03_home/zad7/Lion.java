package GUI03_home.zad7;

public class Lion extends ACarnivore {
    public Lion(String name, Group group) {
        super(name, group);
    }

    @Override
    public boolean isScravenger() {
        return false;
    }


}
