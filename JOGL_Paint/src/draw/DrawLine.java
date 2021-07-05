package draw;

import java.awt.*;
import java.awt.Graphics;

/**
 *
 * @author Joaopcamposs
 */

public class DrawLine extends DrawTool{
    public DrawLine(int startX, int startY, int endX, int endY, int brushWidth, Color color) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.brushWidth = brushWidth;
        this.color = color;
    }

    public void draw(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(brushWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.drawLine(startX, startY, endX, endY);
    }
}
