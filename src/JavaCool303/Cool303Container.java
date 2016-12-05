package JavaCool303;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Cool303Container extends Cool303Component {
  private String label;
  private ArrayList<Cool303Component> componentList;
  private int componentCount;
  private int minimumComponentArea;
  private int containerArea;
  public Cool303Container(String aLabel, Cool303Theme aTheme) {
    this.changeTheme(aTheme);
    label = aLabel;

    componentList = new ArrayList();
    componentCount = 0;
    minimumComponentArea = 0;
  }

void addComponent(Cool303Component aComponent) {

  componentList.add(aComponent);
  componentCount++;
  minimumComponentArea = minimumComponentArea + aComponent.getArea();

}

public int getArea() {

  return minimumComponentArea;
}

private void editLabel(String newLabel) {
  label = newLabel;
}


}
