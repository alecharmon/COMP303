package JavaCool303;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Cool303SampleProgram {

  public static void main(String [] args) {
    JFrame frame = new JFrame("Sample Program");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");

    frame.getContentPane().add(button1, BorderLayout.CENTER);
    frame.getContentPane().add(button2, BorderLayout.LEFT);
    frame.getContentPane().add(button3, BorderLayout.RIGHT);


    frame.pack();
    frame.setVisible(true);
  }
  
}
