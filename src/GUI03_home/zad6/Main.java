package GUI03_home.zad6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Osoba kowalski = new Osoba("Jan", "Kowalski");
        Osoba nowak = new Osoba("Adam", "Nowak");
        Osoba krawczyk = new Osoba("Bartosz", "Krawczyk");
        Osoba heniek = new Osoba("Kierownik", "Heniek");

        Samochod skoda1 = new Samochod("WA00001", "Skoda");
        Samochod skoda2 = new Samochod("SC36010", "Skoda");
        Samochod mazda1 = new Samochod("WA01234", "Mazda");
        Samochod mazda2 = new Samochod("DW01ASD", "Mazda");
        Samochod bmw = new Samochod("WA12690", "BMW");
        Samochod volvo = new Samochod("KR60606", "Volvo");

        /*
         * Jan Kowalski -> SKODA WA00001, BMW WA12690
         * Adam Nowak -> MAZDA DW01ASD
         * Bartosz Krawczyk -> VOLVO KR60606, MAZDA WA01234, SKODA SC36010
         * Kierownik Heniek -> [Brak samochodów]

         * Samochody, których numery rejestracyjne zaczynają się na WA:
         * SKODA WA00001   * BMW WA12690   * MAZDA WA01234   * */

        HashMap<Osoba, List<Samochod>> mapaSamochodow = new HashMap<>();

        mapaSamochodow.put(nowak, new ArrayList<Samochod>());
        mapaSamochodow.get(nowak).add(mazda2);

        mapaSamochodow.put(kowalski, new ArrayList<Samochod>());
        mapaSamochodow.get(kowalski).add(skoda1);
        mapaSamochodow.get(kowalski).add(bmw);

        mapaSamochodow.put(krawczyk, new ArrayList<Samochod>());
        mapaSamochodow.get(krawczyk).add(volvo);
        mapaSamochodow.get(krawczyk).add(skoda2);
        mapaSamochodow.get(krawczyk).add(mazda1);

        mapaSamochodow.put(heniek, new ArrayList<Samochod>());


        for (Map.Entry<Osoba, List<Samochod>> entry : mapaSamochodow.entrySet()){
            System.out.println(entry.getKey() +" posiada " + entry.getValue().size() +" pojazdy");
            // np: Jan Kowalski posiada 3 pojazdy
        }


        System.out.println(mapaSamochodow.get(nowak).get(0)); // MAZDA DW01ASD

        for (Map.Entry <Osoba, List<Samochod>> entry : mapaSamochodow.entrySet()) {
            for (Samochod samochod : entry.getValue()) {
                if(samochod.getNumR().matches("WA.+"))
                    System.out.println(samochod + "; ");
            }
        }
    }
}
