package GUI04_home.zad1;

public class Main {
    public static void main(String[] args) {
        ICale myAdd = ((a, b) -> a+b);
        ICale mySubtract = ((a, b) -> a-b);
        ICale myMultiply = ((a, b) -> a*b);
        ICale myDevide = ((a, b) -> a/b);

        System.out.println(myAdd.oblicz(5,5));
        System.out.println(mySubtract.oblicz(6,3));
        System.out.println(myMultiply.oblicz(7,7));
        System.out.println(myDevide.oblicz(4,2));
    }
}
