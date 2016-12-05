package JavaCool303;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public abstract class Cool303Component extends JComponent{

private void setCoordinates(int newX, int newY) {
  xCoord = newX;
  yCoord = newY;
}

public int getWidth() {
  return width.clone();
}

public int getHeight() {
  return height.clone();
}

public int getArea() {
  return height * width;
}

protected void changeTheme(Cool303Theme newTheme) {
  setTheme = newTheme;
}

private Cool303Theme setTheme;
private int xCoord;
private int yCoord;
private int height;
private int width;

}
