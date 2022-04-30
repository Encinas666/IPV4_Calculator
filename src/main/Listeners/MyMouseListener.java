package main.Listeners;

import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import main.ValoresIniciales;
import main.Algoritmos.Opciones;
import main.Algoritmos.Red;


public class MyMouseListener {
    private int mouseX;
    private int mouseY;
    private Red red;
    private final JPanel panel;

    public MyMouseListener(Red red, JPanel panel) {
        this.red = red;
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (ValoresIniciales.opcion == Opciones.BITS){
            //Mover.getMover().mover(figura, e, mouseX, mouseY, panel);
        }
        if (ValoresIniciales.opcion == Opciones.DECIMAL){
            //Escalar.getEscalar().escalar(figura, e, mouseX, mouseY, panel);
        }
        panel.removeAll();
        panel.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
