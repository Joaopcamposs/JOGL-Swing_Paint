package create;

import draw.*;
import panel.*;

/**
 *
 * @author Joaopcamposs
 */

public class CreateCircle extends CreateShape{
    public DrawShape addShape() {
        alignDrag();
        return new DrawCircle(newX, newY, width, height, PanelTopbar.thicknessValue, PanelSidebar.currentColor, PanelSidebar.filled);
    }
}
