package GUI_04_start.comperatorExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Osoba> osobaList = Arrays.asList(
                new Osoba("Bob", 100, 150),
                new Osoba("Tom", 80, 200),
                new Osoba("Jerry", 90, 170),
                new Osoba("Hope", 120, 180)
        );

        Comparator <Osoba> osobaComparatorWaga = new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                return o1.getWaga() - o2.getWaga();
            }
        };

        osobaList.sort(osobaComparatorWaga);
        System.out.println(osobaList);

        osobaList.sort((o1, o2) -> o1.getWzrost()- o2.getWzrost());
        System.out.println(osobaList);
    }
}

