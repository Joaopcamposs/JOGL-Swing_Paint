package main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Joaopcamposs
 */

public class PaintApp extends JFrame{
    
    public static JPanel newCanvas = new JPanel(new BorderLayout());

    public PaintApp() {
        super("JOGL-Swing Paint");

        this.setSize(1280, 720);
        this.setLocationRelativeTo(null); //alinhar ao centro
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
