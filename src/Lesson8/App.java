package Lesson8;

import javax.swing.*;
import java.awt.*;



    public class App extends JFrame {

        static int conter = 0;

        public App(){
            setTitle("HOHOHOHHHOHOHO");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(300,500,300,500);
            setResizable(false);

            add(new Panel(), BorderLayout.CENTER);
            setVisible(true);
        }
    }


