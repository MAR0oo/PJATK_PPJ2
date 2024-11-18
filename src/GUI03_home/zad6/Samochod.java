package GUI03_home.zad6;

public class Samochod {
    private String marka, numR;

    public String getMarka() {
        return marka;
    }

    public String getNumR() {
        return numR;
    }

    public Samochod(String numR, String marka){
        this.marka = marka;
        this.numR = numR;
    }
    @Override
    public String toString() {
        return  marka + " " + numR;
    }
}
