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
    frame.getContentPane().add(new Cool303Button("COOOL",new Pastels()));
    Cool303Button button1 = new Cool303Button("Butt1",new Pastels());
    Cool303Box box = new Cool303Box(new Winter());
    Cool303Button button2 = new Cool303Button("Butt2", new Winter());
    Cool303Container container = new Cool303Container("Herple Derp", new Winter());
    Cool303Box box2 = new Cool303Box(new Pastels());

    box.addComponent(button1);
    box.addComponent(button2);
    container.addComponent(button2);
    container.addComponent(button1);
    box2.addComponent(button1);
    box2.addComponent(button2);


    JPanel p = new JPanel();
    p.setLayout(new FlowLayout());

    p.add(new Cool303ComponetDecorator(new Winter(),box));
    p.add(new Cool303ComponetDecorator(new Pastels(),container));
    p.add(new Cool303ComponetDecorator(new Pastels(),box2));

    frame.add(p);

//    frame.getContentPane().add(new Cool303ComponetDecorator(new Winter(),box));
    frame.pack();
    frame.setSize(500, 300);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
}
