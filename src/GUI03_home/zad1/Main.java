package GUI03_home.zad1;

public class Main {
    public static void main(String[] args) {
        Kontener<Integer> k1 = new Kontener<>(5);
        Kontener<String> k2 = new Kontener<>("Elo");

        k1.wypisz();
        k2.wypisz();
    }
}
