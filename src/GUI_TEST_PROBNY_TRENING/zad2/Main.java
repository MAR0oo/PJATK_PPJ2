package GUI_TEST_PROBNY_TRENING.zad2;

public class Main {
    interface anonim{
        B b = new B() {
            @Override
            void d() {

            }

            @Override
            public void e(B b) {

            }

            @Override
            public void f(C c) {

            }
        };
    }
    public static void main(String[] args) {
        anonim.b.d();
        anonim.b.e(anonim.b);
        anonim.b.f(anonim.b);
    }
}
