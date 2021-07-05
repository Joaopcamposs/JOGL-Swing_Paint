package panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import main.*;

/**
 *
 * @author Joaopcamposs
 */

public class PanelTopbar extends JPanel implements ActionListener, ChangeListener{

    // Espessura padrão == 12
    public static int thicknessValue = 12;

    private JButton clear, info;
    public static JSlider thickness;
    public static PanelCanvas preview;

    public PanelTopbar() {
        super(new GridLayout());

        JPanel logo = new JPanel();
        JPanel chooseThickness = new JPanel();
        JPanel extras = new JPanel();

        chooseThickness.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Espessura"));
        extras.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Menu"));

        thickness = new JSlider(JSlider.HORIZONTAL, 1, 24, 12);
        preview = new PanelCanvas();

        clear = new JButton("Limpar Tela");
        info = new JButton("Sobre");

        chooseThickness.add(thickness);
        chooseThickness.add(preview);

        extras.add(clear);
        extras.add(info);

        this.add(logo);
        this.add(chooseThickness);
        this.add(extras);
        
        // Capturando acoes para os listeners
        clear.addActionListener(this);
        info.addActionListener(this);
        thickness.addChangeListener(this);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            int result = JOptionPane.showConfirmDialog(Main.paint, "Deseja limpar todo o conteudo da tela?","Limpar Tela", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            // SIM - Limpar tela
            if (JOptionPane.YES_OPTION == result) {
                PanelCanvas.shapes.clear();
                PaintApp.canvas.repaint();
            }
        
        } if (e.getSource() == info) {
            JOptionPane.showMessageDialog(Main.paint, "Criado por João Pedro Campos; 2021", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void stateChanged(ChangeEvent e) {
        thicknessValue = thickness.getValue();

        Color strokeColor = (PanelCanvas.curr == PanelCanvas.eraser) ? Color.WHITE : PanelSidebar.currentColor; 

        // Atualizar a tela se a espessura for alterada
        preview.repaint();
    }
}
