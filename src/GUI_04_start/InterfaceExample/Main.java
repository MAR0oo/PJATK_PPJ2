package GUI_04_start.InterfaceExample;

public class Main {

    public static void main(String[] args) {



        ITest iTest = new ITest() {
            @Override
            public int testMethod(int a, int b) {
                return a + b;
            }
        };

        System.out.println( iTest.testMethod(5,5) );

        ITest iTestLambda = (a, b) -> a+b;
        System.out.println( iTestLambda.testMethod(5,5) );
        ITest iTest1 = (d, a) -> a-d;
        System.out.println((iTest1.testMethod(5,6)));

    }
}
