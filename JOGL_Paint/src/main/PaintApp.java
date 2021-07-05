package main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import panel.*;

/**
 *
 * @author Joaopcamposs
 */

public class PaintApp extends JFrame{
    
    public static JPanel newCanvas = new JPanel(new BorderLayout());
    public static PanelCanvas canvas = new PanelCanvas();
    public static PanelSidebar sidebar = new PanelSidebar();
    public static PanelTopbar topbar = new PanelTopbar();
    public static int canvasWidth = canvas.getWidth();
    public static int canvasHeight = canvas.getHeight();

    public PaintApp() {
        super("JOGL-Swing/AWT Paint - Computação Gráfica");
        
        // Novo JPanel no centro
        newCanvas.add(canvas, BorderLayout.CENTER);
        
        // Configurando cada componente no JFrame principal
        this.add(topbar, "North");
        this.add(sidebar, "West");
        this.add(newCanvas, "Center");

        this.setSize(1280, 720);
        this.setLocationRelativeTo(null); //alinhar ao centro
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
