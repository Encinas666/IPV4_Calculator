package main.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.Border;

import main.ValoresIniciales;
import main.Algoritmos.Opciones;

public class Botones extends JPanel implements ActionListener{
    private JButton btnMover;
    private JButton btnEscalar;
    private JButton btnRotar;
    private JButton btnGuardar;
    private JButton btnDashed;
    private JButton btnRellenar;

    private JPanel panel;

    public Botones(JPanel panel){
        this.panel = panel;
        init();
    }

    private void init(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(ValoresIniciales.COLOR_FONDO);

        int btnSize = 40;
        Border border = BorderFactory.createEmptyBorder();

        //Mover
        btnMover = new JButton();
        btnMover.setSize(btnSize, btnSize);
        btnMover.setBackground(ValoresIniciales.COLOR_FONDO);
        btnMover.setBorder(border);
        btnMover.setOpaque(true);
        btnMover.addActionListener(this);
        btnMover.setToolTipText("Mover");

        //Escalar
        btnEscalar = new JButton();
        btnEscalar.setSize(btnSize, btnSize);
        btnEscalar.setBackground(ValoresIniciales.COLOR_FONDO);
        btnEscalar.setBorder(border);
        btnEscalar.setOpaque(true);
        btnEscalar.addActionListener(this);
        btnEscalar.setToolTipText("Escalar");

        //Rotar
        btnRotar = new JButton();
        btnRotar.setSize(btnSize, btnSize);
        btnRotar.setBackground(ValoresIniciales.COLOR_FONDO);
        btnRotar.setBorder(border);
        btnRotar.setOpaque(true);
        btnRotar.addActionListener(this);
        btnRotar.setToolTipText("Rotar");

        //Ancho Línea
        btnGuardar = new JButton();
        btnGuardar.setSize(btnSize, btnSize);
        btnGuardar.setBackground(ValoresIniciales.COLOR_FONDO);
        btnGuardar.setBorder(border);
        btnGuardar.setOpaque(true);
        btnGuardar.addActionListener(this);
        btnGuardar.setToolTipText("Guardar");

        //Dashed
        btnDashed = new JButton();
        btnDashed.setSize(btnSize, btnSize);
        btnDashed.setBackground(ValoresIniciales.COLOR_FONDO);
        btnDashed.setBorder(border);
        btnDashed.setOpaque(true);
        btnDashed.addActionListener(this);
        btnDashed.setToolTipText("Dashed");

        //Rellenar
        btnRellenar = new JButton();
        btnRellenar.setSize(btnSize, btnSize);
        btnRellenar.setBackground(ValoresIniciales.COLOR_FONDO);
        btnRellenar.setBorder(border);
        btnRellenar.setOpaque(true);
        btnRellenar.addActionListener(this);
        btnRellenar.setToolTipText("Rellenar");

        try{
            btnMover.setIcon(new ImageIcon("src/resources/icons-mover-30.png"));
            btnEscalar.setIcon(new ImageIcon("src/resources/icons-escalar-30.png"));
            btnRotar.setIcon(new ImageIcon("src/resources/icons-girar-30.png"));
            btnGuardar.setIcon(new ImageIcon("src/resources/icons-guardar-30.png"));
            btnDashed.setIcon(new ImageIcon("src/resources/icons-dashed-line-30.png"));
            btnRellenar.setIcon(new ImageIcon("src/resources/icons-relleno-30.png"));
        }catch (Exception e){
            e.printStackTrace();
        }

        this.add(btnMover);
        this.add(btnEscalar);
        this.add(btnRotar);
        this.add(btnRellenar);
        this.add(new JSeparator());
        this.add(btnGuardar);
        //this.add(btnDashed);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMover){
        }
        if (e.getSource() == btnEscalar){
        }
        if (e.getSource() == btnRotar){
        }
        if (e.getSource() == btnGuardar){
        }
        if (e.getSource() == btnDashed){
        }
        if (e.getSource() == btnRellenar){
        }
    }
    
}
