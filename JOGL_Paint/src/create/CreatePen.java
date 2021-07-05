package create;

import draw.*;
import java.awt.*;
import java.awt.event.*;
import panel.*;

/**
 *
 * @author Joaopcamposs
 */

public class CreatePen extends CreateTool{
    public void mouseDragged(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        PanelCanvas.shapes.add(new DrawLine(x1, y1, x2, y2, PanelTopbar.thicknessValue, fetchColor()));

        // Seta as coordenadas atuais para as anteriores
        x1 = x2;
        y1 = y2;
    }
    
    public void mousePressed(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        // Seta as coordenadas atuais para as anteriores
        x1 = x2;
        y1 = y2;

        PanelCanvas.shapes.add(new DrawLine(x2, y2, x2, y2, PanelTopbar.thicknessValue, fetchColor()));
    }

    public void mouseReleased(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();

        PanelCanvas.shapes.add(new DrawLine(x1, y1, x2, y2, PanelTopbar.thicknessValue, fetchColor()));
    }

    public Color fetchColor() {
        return PanelSidebar.currentColor;
    }
}
