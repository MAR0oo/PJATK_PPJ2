package GUI03_home.zad7;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Enclosure> enclosureList = new ArrayList<>();
    private List<Worker> workerList = new ArrayList<>();

    public void addEnclosure(Enclosure enclosure){
        this.enclosureList.add(enclosure);
    }

    public List<Worker> getWorkerList(){
        return workerList;
    }

    public List<Enclosure> getEnclosureList() {
        return enclosureList;
    }

    public void showAllAnimals(){
        for (Enclosure t: enclosureList) {
            for(Object a: t.getEnclosure()){
                System.out.println(a);
            }
        }
    }

    public void showAllWorkers(){
        for (Worker w : workerList) {
            System.out.println(w + " ");
        }
    }
}
