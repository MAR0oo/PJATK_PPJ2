package GUI04_home.zad2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = Arrays.asList(
                new Animal("Cheetah", 150, 50, 200),
                new Animal("Lion", 200, 70, 150),
                new Animal("Elephant", 700, 400, 50),
                new Animal("Dog", 30, 40, 70)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Waga: " );
        int x = scanner.nextInt();
        System.out.print("Wzrost: " );
        int y = scanner.nextInt();
        System.out.print("Szybkosc: " );
        int z = scanner.nextInt();
        System.out.println();

        Predicate<Animal> predicate1 = animal -> animal.getWeight()>x;
        Predicate<Animal> predicate2 = animal -> animal.getHigh()>y;
        Predicate<Animal> predicate3 = animal -> animal.getTopSpeed()>z;

        animalList.stream()
                .filter(predicate1)
                .filter(predicate2)
                .filter(predicate3)
                .map(animal -> animal.getName())
                .forEach(s -> System.out.println(s));

        System.out.println("\n");

        for (Animal a: animalList) {
            if(a.getWeight()>50 && a.getTopSpeed()>50 && a.getHigh()>50)
                System.out.println(a.getName());
        }
        Comparator<Animal> animalComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getWeight() - o2.getWeight();
            }
        };

        animalList.sort(animalComparator);
        System.out.println(animalList);

        animalList.sort((o1, o2) -> o1.getTopSpeed()-o2.getTopSpeed());
        System.out.println(animalList);
    }
}
