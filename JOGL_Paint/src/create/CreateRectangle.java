package create;

import draw.*;
import panel.*;

/**
 *
 * @author Joaopcamposs
 */

public class CreateRectangle extends CreateShape{
    public DrawShape addShape() {
        alignDrag();
        return new DrawRectangle(newX, newY, width, height, PanelTopbar.thicknessValue, PanelSidebar.currentColor, PanelSidebar.filled);
    }
}
