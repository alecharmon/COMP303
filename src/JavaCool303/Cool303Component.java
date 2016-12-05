package JavaCool303;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public abstract class Cool303Component extends JComponent{

  protected Cool303Component(Cool303Theme theme){
    super();
    this.theme = theme;
  }
private void setCoordinates(int newX, int newY) {
  xCoord = newX;
  yCoord = newY;
}

public int getWidth() {
  return width;
}

public int getHeight() {
  return height;
}

public int getArea() {
  return height * width;
}

public void render(Graphics g) {
  if ( this instanceof Cool303Button){
            System.out.println("Button");
            g.setColor(Color.black);
            g.fillOval(0, 0, 500, 100);
        }
        else if (this instanceof  Cool303Box){
            System.out.println("BOX");
            g.setColor(Color.black);
            g.fillRect(0, 0, 100, 100);
        }
        else{
            System.out.println("BLEH");
        }
}

protected void changeTheme(Cool303Theme newTheme) {
  theme = newTheme;
}



  public void paintComponent(Graphics g)
  {
    System.out.println("Componet paint called");
    super.paintComponent(g);
  }
private Cool303Theme theme;
private int xCoord;
private int yCoord;
private int height;
private int width;

}
