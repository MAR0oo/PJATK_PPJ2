package FUN.kalendarz;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        super("Kalendarz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setLocation(50,50);
        setLayout(new FlowLayout());


        add(new JButton("Dodaj do kalendarza"));
        add(new JButton("Usuń się z kalendarza"));
        add(new JButton("HELP"));


        setVisible(true);
    }
}
