package JavaCool303;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Created by alec on 12/4/16.
 */
public class Cool303Button extends Cool303Component implements ActionListener{
    public Cool303Button(String text,Cool303Theme theme){
        super(theme);
//        System.out.println(super.toString());
//        this.setLocation(10, 10);
//        this.setSize(5, 5);
//        this.label = text;
//
//        CoolButton = new JButton(label);
//        CoolButton.setBackground(theme.getBackgroundColor());
//        CoolButton.setForeground(theme.getBackgroundColor());
//        CoolButton.setFocusPainted(false);
//        CoolButton.setFont(new Font(theme.getFontName(), Font.PLAIN, 12));
    }

    @Override
    public void paintComponent(Graphics g) {
        System.out.print("asda");
        super.paintComponent(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello world");
    }

    private JButton CoolButton;
    private String label;
}
