package GUI_04_home.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Osoba> osobaList = Arrays.asList(
                new Osoba("Bob", 100, 150),
                new Osoba("Tom", 80, 200),
                new Osoba("Jerry", 90, 170),
                new Osoba("Hope", 120, 180)
        );

        osobaList.stream()
                .filter(osoba -> osoba.getWaga() > 80 )
                .filter(osoba -> osoba.getWzrost() > 160)
                .map(osoba ->   osoba.getImie())
                .forEach( s -> System.out.println(s));
    }
}
