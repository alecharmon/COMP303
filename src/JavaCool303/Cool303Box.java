package JavaCool303;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Cool303Box extends Cool303Container {
  public Cool303Box(Cool303Theme theme) {
    super("",theme);
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

  	System.out.println("BOX");
    g.setColor(theme.getBackgroundColor());

    if (mode == "Horizontal") {
    	g.fillRect(0, 0, this.minimumComponentWidth, largestComponentHeight); //fill shape will depend on theme
    } 
    else if (mode == "Vertical") {
    	g.fillRect(0, 0, largestComponentWidth, this.minimumComponentHeight);
    }

    int translationX = 0;
    int translationY = 0;

    for( Cool303Component component: componentList){

      component.render(g);

      if (mode == "Horizontal") {
      	translationX = translationX + component.getWidth();
      }
      else if (mode == "Horizontal") {
      	translationY = translationY + component.getHeight();
      }

      g.translate(translationX, translationY);
    }

  }
}
