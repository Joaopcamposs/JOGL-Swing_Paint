package create;

import draw.*;
import java.awt.event.*;
import panel.*;

/**
 *
 * @author Joaopcamposs
 */

public class CreateShape extends CreateTool{
    public void mouseDragged(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        PanelCanvas.shapes.set(PanelCanvas.shapes.size()-1, addShape());

    }

    public void mousePressed(MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();

        PanelCanvas.shapes.add(new DrawTool());
    }

    public void mouseReleased(MouseEvent event) {
    }

    public DrawShape addShape() {
        alignDrag();
        return new DrawShape(newX, newY, width, height, PanelTopbar.thicknessValue, PanelSidebar.currentColor, PanelSidebar.filled);
    }

    // A largura e altura da forma são criadas usando os pontos inicial e final
    public void alignDrag() {
        width = Math.abs(x2-x1);
        height = Math.abs(y2-y1);
        newX = x1;
        newY = y1;

        if (x2 < x1 && y2 > y1) {
            newX = x2;

        } if (x2 > x1 && y2 < y1) {
            newY = y2;

        } if (x2 <= x1 && y2 <= y1) {
            newX = x2;
            newY = y2;
        }
    }
}
