package JavaCool303;

import javax.swing.*;
import java.awt.*;

public class Cool303SampleProgram {

  public static void main(String [] args) {


//    Cool303Box cb = new Cool303Box(new Winter());
//
//    cb.add(new Cool303Button("COOOL",new Winter()));
//
//    Cool303Frame cf = new Cool303Frame(new Winter(), cb);
//
//    cf.render();
//
//

    JFrame frame = new JFrame("Sample Program");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    frame.getContentPane().add(new Cool303Button("COOOL",new Winter()));
    Cool303Button button = new Cool303Button("COOOL",new Winter());
    JButton b1 = new JButton("1");
    Cool303Box box = new Cool303Box(new Winter());

    JPanel p = new JPanel();
    p.setLayout(new FlowLayout());

    p.add(new Cool303ComponetDecorator(new Winter(),box));
    p.add(new Cool303ComponetDecorator(new Winter(),button));

    frame.add(p);

//    frame.getContentPane().add(new Cool303ComponetDecorator(new Winter(),box));
    frame.pack();
    frame.setSize(500, 300);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
}
