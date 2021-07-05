package draw;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Joaopcamposs
 */

public class DrawCircle extends DrawShape {
    public DrawCircle(int startX, int startY, int width, int height, int brushWidth, Color color, Boolean filled) {
        super(startX, startY, width, height, brushWidth, color, filled);
    }

    public void draw(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(brushWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        // Cria o retangulo preenchido ou vazio
        if (filled)
            g2d.fillOval(startX, startY, width, height);
        else
            g2d.drawOval(startX, startY, width, height);
    }
}
