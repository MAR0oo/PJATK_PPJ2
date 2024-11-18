package GUI03_home.zad2;

public class Kontener <T, S> {
    private T t;
    private S s;
    public Kontener(T t, S s){
        this.t = t;
        this.s = s;
    }
    public void wypisz(){
        System.out.println(t);
        System.out.println(s);
    }
}
