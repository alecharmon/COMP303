package JavaCool303;
import java.awt.Color;

/**
 * Created by alec on 12/4/16.
 */

public class Pastels implements Cool303Theme {
    private Color fontColor = Color.PINK;
    private String fontName = "Comic Sans MS";
    private Color backgroundColor = Color.MAGENTA;
    private Color buttonColor = Color.ORANGE;

    public Color getFontColor() {
        return fontColor;
    }

    public String getFontName() {
        return fontName;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getButtonStyle() {
        return buttonColor;
    }
}
