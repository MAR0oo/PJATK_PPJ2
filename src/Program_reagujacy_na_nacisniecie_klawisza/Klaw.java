package Program_reagujacy_na_nacisniecie_klawisza;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Klaw {
    public static void main(String[] args) {
        Okno ok = new Okno();
        ok.setVisible(true);
    }
}

class Okno extends JFrame implements KeyListener {
    JLabel labKod, labText;
    int x=80, y=50;
    int width=300, height=150;

    Okno(){
        setTitle("Kod naciśniętego klawisza");
        setSize(width,height);
        setDefaultCloseOperation(3);
        setLayout(null);

        labKod = new JLabel("  ");
        labKod.setBounds(x,20,x,20);

        add(labKod);

        labText = new JLabel("  ");
        labText.setBounds(x,y,x,y);
        add(labText);

        addKeyListener(this);

    }


    @Override
    public void keyTyped(KeyEvent e) {
        int kod = e.getKeyCode();
        labKod.setText(" " + kod);

        if (kod == 37){ x=x-10; if (x<0) x=width; labText.setBounds(x,y,x,y);} // w lewo
        if (kod == 39) { x=x+10; if (x>width) x=0;
        labText.setBounds(x,y,x,y);}// w prawo
        if (kod == 38){ y=y-10; if (y<0) y=height; labText.setBounds(x,y,x,y);} // w górę
        if (kod == 40){ y=y+10; if (y>height) y=0; labText.setBounds(x,y,x,y);} // w dół
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
