package JavaCool303;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Cool303Box extends Cool303Container {

  public Cool303Box(Cool303Theme aTheme) {
    super("", aTheme);
  }

  public void setArea(int newArea) {
    if (this.super().getArea < newArea) {
      this.containerArea = newArea;
    }
    else {}
  }
}
