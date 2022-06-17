package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public abstract class Panel extends JPanel {
   public Panel()

    {

        Font font = new Font("Arrial", Font.BOLD, 20);
        JButton myBaton = new JButton("Go");
        myBaton.setFont(font);
        add(myBaton);

        TextField textField = new TextField(" +7999 000 00 00");
        textField.setFont(font);
        add(textField);
        myBaton.setText("0");

        myBaton.addActionListener(new AbstractAction() {
                                      @Override
                                      public void actionPerformed(ActionEvent e) {
                                          myBaton.setText(generateTelephoneNumber());
                                      }
                                  }
        );
        setVisible(true);

    }
    public String generateTelephoneNumber() {

        Random random = new Random();
        String telephoneNumber = "";
        telephoneNumber = "+7";
        telephoneNumber = "999";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
   return telephoneNumber;
    }


}

