package GUI03_home.zad7;

import java.util.ArrayList;
import java.util.List;

public class Enclosure <T extends AAnimal>{
    private List<T> enclosure = new ArrayList<>();

    public void addAnimalToEnclosure(T animal){
        enclosure.add(animal);
    }
    public List<T> getEnclosure(){
        return enclosure;
    }


}
