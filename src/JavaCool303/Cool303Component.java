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

}

protected void changeTheme(Cool303Theme newTheme) {
  theme = newTheme;
}



public void paintComponent(Graphics g)
  {
    System.out.println("Componet paint called");
    super.paintComponent(g);
  }

protected Cool303Theme theme;
protected int xCoord;
protected int yCoord;
protected int height;
protected int width;

}
