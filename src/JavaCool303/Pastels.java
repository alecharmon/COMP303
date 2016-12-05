package JavaCool303;
import java.awt.Color;

/**
 * Created by alec on 12/4/16.
 */

public class Pastels implements Cool303Theme {
    private Color fontColor = Color.BLACK;
    private String fontName = "Comic Sans MS";
    private Color backgroundColor = Color.MAGENTA;
    private Color buttonColor = Color.YELLOW;
    private Color buttonBorderColor = Color.ORANGE;

    public Color getFontColor() {
        return fontColor;
    }

    public String getFontName() {
        return fontName;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getButtonColor() {
        return buttonColor;
    }

    public Color getButtonBorderColor() {
        return buttonBorderColor;
    }
}
