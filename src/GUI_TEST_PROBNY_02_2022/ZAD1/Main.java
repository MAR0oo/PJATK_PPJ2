package GUI_TEST_PROBNY_02_2022.ZAD1;

public class Main {
    public static void main(String[] args) {
        F ff = new F() {
            @Override
            void z() {
                System.out.println("z");
            }
        };
        B b = new B(ff);
        b.pole.z();
        new D().z();

    }
}
