package JavaCool303;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Cool303Container extends Cool303Component {
  private String label;
  protected ArrayList<Cool303Component> componentList;
  private int componentCount;
  protected int minimumComponentHeight;
  protected int minimumComponentWidth;
  private int containerArea;

  public Cool303Container(String aLabel, Cool303Theme aTheme) {
    super(aTheme);
    this.label = aLabel;
    componentList = new ArrayList<Cool303Component>();
    componentCount = 0;
    minimumComponentWidth = 0;
    minimumComponentHeight = 0;
  }

  public void addComponent(Cool303Component aComponent) {
    componentList.add(aComponent);
    componentCount++;
    minimumComponentWidth = minimumComponentWidth + aComponent.getWidth();
    minimumComponentHeight = minimumComponentHeight + aComponent.getHeight();
  }

  public void render(Graphics g){
    String mode = "";
    if (this.minimumComponentWidth > this.minimumComponentHeight) {
      mode = "Horizontal";
    }
    else if (this.minimumComponentWidth < this.minimumComponentHeight) {
      mode = "Vertical";
    }
    else if (this.minimumComponentWidth == this.minimumComponentHeight) {
      mode = "Horizontal";
    }

    int largestComponentHeight = 0;
    int largestComponentWidth = 0;
    for(Cool303Component component: componentList) {

      if (component.getHeight() > largestComponentHeight) {
        largestComponentHeight = component.getHeight();
      }

      if (component.getWidth() > largestComponentWidth) {
        largestComponentWidth = component.getWidth();
      }
    }

    System.out.println("Container");

    if (mode == "Horizontal") {
      g.clearRect(0, 0, this.minimumComponentWidth, largestComponentHeight + 15); //fill shape will depend on theme
    } 
    else if (mode == "Vertical") {
      g.clearRect(0, 0, largestComponentWidth, this.minimumComponentHeight + 15);
    }


    g.setColor(Color.black);
    g.drawString(label, 0, 12);


    int translationX = 0;
    int translationY = 0;
    g.translate(0, 15);

    for( Cool303Component component: componentList){

      component.render(g);

      if (mode == "Horizontal") {
        translationX = translationX + component.getWidth();
      }
      else if (mode == "Vertical") {
        translationY = translationY + component.getHeight();
      }

      g.translate(translationX, translationY);
    }

  }

  private void editLabel(String newLabel) {
  label = newLabel;
}


}
