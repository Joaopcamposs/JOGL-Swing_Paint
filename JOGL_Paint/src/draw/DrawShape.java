package draw;

import java.awt.*;

/**
 *
 * @author Joaopcamposs
 */

public class DrawShape extends DrawTool{
    
    // construtor com parametros iniciais
    public DrawShape(int startX, int startY, int width, int height, int brushWidth, Color color, Boolean filled) {
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
        this.brushWidth = brushWidth;
        this.color = color;
        this.filled = filled;
    }
}
