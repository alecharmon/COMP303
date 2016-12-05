package JavaCool303;

import javax.swing.*;
import java.awt.*;

/**
 * Created by alec on 12/4/16.
 */
class Cool303ComponetDecorator extends JComponent
{
    private Cool303Theme theme;
    private Cool303Component component ;
    public Cool303ComponetDecorator(Cool303Theme theme, Cool303Component c )
    {
        super();
        this.theme = theme;
        this.component = c;
        System.out.println(super.toString());
    }

    public Dimension getPreferredSize(){
        c.get
        return new Dimension(500,100);
    }
    public Dimension getMinimumSize(){
        return new Dimension(500,100);
    }
    public Dimension getMaximumSize(){
        return new Dimension(500,100);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        component.render(g);
    }
}