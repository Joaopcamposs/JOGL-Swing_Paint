package panel;

import create.*;
import draw.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Joaopcamposs
 */

public class PanelCanvas extends JPanel implements MouseMotionListener, MouseListener{

    // ArrayList global para pintura
    public static ArrayList<DrawTool> shapes = new ArrayList<>();
    
    // ferramentas (global)
    public static CreateTool eraser = new CreateEraser();
    public static CreateTool pen = new CreatePen();
    public static CreateTool line = new CreateLine();
    public static CreateTool rectangle = new CreateRectangle();
    public static CreateTool circle = new CreateCircle();
    
    // Iniciar como "pen" ferramenta padrao
    public static CreateTool curr = pen;
    
    //construtor
    public PanelCanvas() {
        this.setBackground(Color.WHITE);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }
    
    public void panelPreview() {
        this.setPreferredSize(new Dimension(34, 34));
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        this.curr.mouseDragged(e);
        this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.curr.mousePressed(e);
        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.curr.mouseReleased(e);
        this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {  
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // strokeColor branca se a ferramenta atual é a borracha
        Color strokeColor = (PanelCanvas.curr == PanelCanvas.eraser) ? Color.WHITE : PanelSidebar.currentColor; 

        // Desenhando da caneta
        g2d.setStroke(new BasicStroke(PanelTopbar.thicknessValue, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setColor(strokeColor);
        g2d.drawLine(17, 17, 17, 17);

        // arraylist de ferramentas de desenho
        for (DrawTool i : shapes) {
            i.draw(g);
        }
    }
    
}
