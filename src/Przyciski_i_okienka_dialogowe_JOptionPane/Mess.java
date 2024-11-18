package Przyciski_i_okienka_dialogowe_JOptionPane;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mess implements ActionListener {
    JFrame ok;

    public static void main(String[] args) {
        Mess db = new Mess();
    }

    public Mess() {
        ok = new JFrame("Dialogowe okienko komunikatu");
        JButton button = new JButton("Kliknij mnie");
        button.addActionListener(this);
        ok.add(button);
        ok.setVisible(true);
        ok.setSize(300,200);
        ok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(ok, "Czy mnie lubisz?","tytuł - pytanie",
                JOptionPane.YES_NO_CANCEL_OPTION);

        Object[] options = { "DALEJ", "ANULUJ" };
        int x = JOptionPane.showOptionDialog(null, "Czy chcesz kontynuować?",
                "tytuł okienka", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);

        if(x==0){
            String imie = JOptionPane.showInputDialog(null, "Podaj imię",
                    "tytuł - pobieranie danej", JOptionPane.QUESTION_MESSAGE);

            JOptionPane.showMessageDialog(ok, "Witaj " + imie, "tytuł komunikatu",
                    JOptionPane.INFORMATION_MESSAGE);

        }
    }
}



