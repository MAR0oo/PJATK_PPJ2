package GUI_TEST_PROBNY_02_2022.ZAD2;

public class Main {
    public static void main(String[] args) {
        class anonim{
            B b = new B() {
                @Override
                void d() {
                    System.out.println("sa");
                }

                @Override
                public void e(B b) {
                    System.out.println("sad");
                }

                @Override
                public void f(C c) {
                    System.out.println("sads");
                }
            };

        }
        anonim s = new anonim();
        s.b.d();
        s.b.e(s.b);
        s.b.f(s.b);
    }
}
