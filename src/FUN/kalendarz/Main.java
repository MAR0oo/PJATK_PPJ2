package FUN.kalendarz;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w kalendarzu Marka!" + "\nMożesz tutaj zarezerwować termin dla siebie");
        System.out.println("Kliknij 1 by zarezerwować termin");

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });
    }
}
