package GUI_04_start.comperatorExample;

public class Osoba {
    private String imie;
    private int waga;
    private int wzrost;

    public Osoba(String imie, int waga, int wzrost) {
        this.imie = imie;
        this.waga = waga;
        this.wzrost = wzrost;
    }

    public String getImie() {
        return imie;
    }

    public int getWaga() {
        return waga;
    }

    public int getWzrost() {
        return wzrost;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", waga=" + waga +
                ", wzrost=" + wzrost +
                '}';
    }
}
