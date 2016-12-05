package JavaCool303;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Cool303Box extends Cool303Container {
  public Cool303Box(Cool303Theme theme) {
    super("",theme);
  }

  public void render(){
    for( Cool303Component component: componentList){
      //component.render();
    }

  }
}
