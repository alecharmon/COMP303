package JavaCool303;

import javax.swing.*;

/**
 * Created by alec on 12/4/16.
 */
public class Cool303Frame {
    private Cool303Box box;
    private JFrame frame;
    public Cool303Frame(Cool303Theme theme, Cool303Box box){
        this.box = box;
        frame = new JFrame("Sample Program");
        this.box.render();
    }

    public void render(){
        box.render();
    };

}
