package JavaCool303;
import java.awt.Color;

/**
 * Created by alec on 12/4/16.
 */

public class Winter implements Cool303Theme {
    private Color fontColor = Color.WHITE;
    private String fontName = "Comic Sans MS";
    private Color backgroundColor = Color.BLUE;
    private Color buttonColor = Color.GRAY;
    private Color buttonBorderColor = Color.WHITE;

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
