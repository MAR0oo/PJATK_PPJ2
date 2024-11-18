package GUI03_home.zad7;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Enclosure<ACarnivore> aCarnivoreEnclosure = new Enclosure<>();
        zoo.addEnclosure(aCarnivoreEnclosure);

        Worker workerNormal = new Worker("Bob");

        Worker workerDoc = new Worker("Dorian"){
            public void healAnimal(AAnimal animal){
                System.out.println("healing " + animal);
            }

            @Override
            public String toString() {
                return "$classname{" +
                        "name='" + this.getName() + '\'' +
                        "speciality='" + "Doc" + '\'' +
                        '}';
            }
        };

        zoo.getWorkerList().add(workerNormal);
        zoo.getWorkerList().add(workerDoc);

        aCarnivoreEnclosure.addAnimalToEnclosure(new Lion("HappyLion", Group.MAMMAL));
        //aCarnivoreEnclosure.addAnimalToEnclosure(new Giraffe("SuperSadGiraff", Group.MAMMAL));


        zoo.addEnclosure(new Enclosure<AHerbavore>());
        zoo.getEnclosureList().get(1).addAnimalToEnclosure(new Giraffe("HappyGiraff", Group.MAMMAL));
        zoo.getEnclosureList().get(1).addAnimalToEnclosure(new Lion("SuperHappyLion", Group.MAMMAL));
        zoo.getEnclosureList().get(1).getEnclosure().add(workerNormal);

        zoo.showAllAnimals();
        System.out.println();
        zoo.showAllWorkers();
    }
}
