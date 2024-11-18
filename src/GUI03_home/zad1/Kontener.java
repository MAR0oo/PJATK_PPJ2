package GUI03_home.zad1;

public class Kontener <T> {
    private T t;
    public Kontener(T t){
        this.t = t;
    }
    public void wypisz(){
        System.out.println(t);
    }
}
