package draw;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Joaopcamposs
 */

public class DrawRectangle extends DrawShape{
    public DrawRectangle(int startX, int startY, int width, int height, int brushWidth, Color color, Boolean filled) {
        super(startX, startY, width, height, brushWidth, color, filled);
    }

    public void draw(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(brushWidth));

        // Cria o circulo preenchido ou vazio
        if (filled)
            g2d.fillRect(startX, startY, width, height);
        else
            g2d.drawRect(startX, startY, width, height);
    }
}
