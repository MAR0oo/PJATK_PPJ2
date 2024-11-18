package KLASA_GRAPHICS2D;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Kolowy {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Okno ok = new Okno(n);
    }
}

class Okno extends JFrame{
    Random r = new Random();
    int n;
    int [] x;
    int suma = 0;
    Wykres k;

    Okno(int n){
        setSize(300,300);
        setTitle("Wykres kołowy - dane losowe");
        setDefaultCloseOperation(3);

        x = new int[n];
        for (int i = 0; i < n; i++) {
            k = new Wykres(n,x);
            add(k);
            setVisible(true);
        }
    }
    class Wykres extends Canvas {
        int n = 20;
        int [] x = new int[n];
        int suma = 0;
        Random r = new Random();

        Wykres(int nd, int[] dane) {
            n = nd;
            for (int i = 0; i < n; i++) {
                x[i] = dane[i];
                suma=suma+x[i];
            }
            setBackground(Color.orange);
        }

        @Override
        public void paint(Graphics g) {
            int xp = 10, yp = 10;
            int szer = getWidth() - 10;
            int wys = getHeight() - 10;
            int katP = 0;
            for (int i = 0; i < n; i++){
                double kK = (double) x[i]/suma*360;
                int katK = (int)kK;
                if (i == n-1) katK=360-katP;
                Color k = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));

                g.setColor(k);
                g.fillArc(xp,yp,szer,wys,katP,katK);
                katP = katP+katK;

            }
            g.setColor(Color.white);
            StringBuilder s = new StringBuilder("Liczby: ");
            for (int i = 0; i < n; i++) s.append(x[i] + ", ");
            g.drawString(s.toString(),10,70);
        }
    }

}




