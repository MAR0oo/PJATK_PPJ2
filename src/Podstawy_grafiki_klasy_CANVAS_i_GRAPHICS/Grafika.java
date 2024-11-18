package Podstawy_grafiki_klasy_CANVAS_i_GRAPHICS;

import javax.swing.*;
import java.awt.*;

public class Grafika extends JFrame {
    public static void main(String[] args) {
        Grafika ok = new Grafika();
        ok.setSize(300,200);
        ok.setDefaultCloseOperation(3);
        ok.setTitle("Moja pierwsza j-grafika");

        ok.add(new Kanawa());
        ok.setVisible(true);
    }
}
class Kanawa extends Canvas{
    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillRoundRect(30,30,190,100,10,20);

        g.setColor(Color.green);
        g.fillOval(50,50,150,100);

        g.setColor(Color.blue);
        g.drawLine(10,10,280,150);

        Font f = new Font("TimesRoman", Font.BOLD, 36);
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Wow - JAVA!", 60, 100);


    }
}
