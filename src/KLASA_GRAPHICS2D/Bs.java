package KLASA_GRAPHICS2D;

import javax.swing.*;
import java.awt.*;

public class Bs extends JFrame {
    public static void main(String[] args) {
        Bs ok = new Bs();
        ok.setSize(240,170);
        ok.setLocation(400,300);
        ok.setDefaultCloseOperation(3);

        ok.add(new Kanawa());
        ok.setVisible(true);
    }
}
class Kanawa extends Canvas {

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(8.0f,0,2));

        g2.setPaint(Color.blue);
        Rectangle r = new Rectangle(10,10,200,110);
        g2.draw(r);

        g2.setPaint(Color.red);
        Rectangle rr = new Rectangle(50,50,50,50);
        g2.draw(rr);

        g.setColor(Color.green);
        g.fillOval(120,30,100,45);
        g.setColor(Color.yellow);
        g.drawOval(130,30,100,45);
    }
}
