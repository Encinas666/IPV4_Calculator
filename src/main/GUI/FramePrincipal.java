package main.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.ValoresIniciales;

public class FramePrincipal extends JFrame {
    JFrame frame;
    JComboBox<String> bits;
    JComboBox<String> hexa;
    JComboBox<String> decimal;
    Integer[] ip_ ;
    boolean ban;

    public FramePrincipal(){
        init();
        setIconImage(new ImageIcon(getClass().getResource("src/resource/red1.png")).getImage());
        frame = this;
        Integer[] ip_  = new Integer[4];
    }

    private void init(){
        this.bits = new JComboBox<>();
        this.decimal = new JComboBox<>();
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        this.setSize(ValoresIniciales.MAIN_WIDTH, ValoresIniciales.MAIN_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("CALCULADORA_IP");

        this.add(pAjustes());
        this.add(pCalculadoraIp());

        this.setVisible(true);
    }

    private JPanel pCalculadoraIp(){
        JPanel panel = new JPanel(null);
        panel.setBackground(Color.BLACK);
        panel.setBorder(BorderFactory.createTitledBorder(null, "DIRECCION DE RED:",1,0, null, Color.white));
    
        //Imagen
        try{
           JLabel imagenContenedor = new JLabel(new ImageIcon(new ImageIcon("src/resource/calc_ip.png").getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT)));
           imagenContenedor.setBounds(20, 25, 180, 180);
           panel.add(imagenContenedor);
        }catch (Exception e) {
            e.printStackTrace();
        }

        Font font = new Font("Arial", Font.PLAIN, 15);
        JLabel lblIP = new JLabel("IP:");
        lblIP.setBounds(250, 55, 150, 25);
        lblIP.setFont(font);
        lblIP.setForeground(Color.WHITE);
        panel.add(lblIP);

        JTextField txtDR = new JTextField("0.0.0.0");
        txtDR.setBounds(250, 80, 200, 25);
        panel.add(txtDR);

        JButton calcular = new JButton("<html><span style='font-size:10px'>"+"Calcular"+"</span></html>");
        calcular.setForeground(Color.WHITE);
        calcular.setBounds(300, 120, 100, 40);
        calcular.setBorder(null);
        calcular.setFocusable(false);
        calcular.setBackground(Color.BLUE);
        panel.add(calcular);
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ban = true;
                if (!txtDR.getText().isEmpty()){
                    
                    System.out.println(ban);
                    if(ban){
                        //ajustesCalculos(bits, decimal);
                        new FrameContenedor(ip_);
                        frame.setState(Frame.ICONIFIED);
                        
                    }else{
                        mensajeError();
                    }
                }else{
                    mensajeError();
                }
            }
        });
        return panel;
    }

    private JPanel pAjustes(){
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(null, "AJUSTES:",1,0, null, Color.white));
    
        panel.setBackground(Color.BLACK);
        panel.setMaximumSize(new Dimension(this.getWidth(), 50));

        bits.setBounds(70, 10, 120, 25);
        for(int i = 1; i<=32;i++){
            bits.addItem(""+i);
        }
        panel.add(bits);

        decimal.setBounds(330, 10, 120, 25);
        panel.add(decimal);

        return panel;
    }

    // private void ajustesCalculos(JComboBox<String> bits_, JComboBox<String> decimal_){
    //     if (bits_.getSelectedIndex() == 0) {
    //         ValoresIniciales.intervalo = 0;
    //     }else{
    //         ValoresIniciales.intervalo = 7;
    //     }
    //     if (decimal_.getSelectedIndex() == 0){
    //         ValoresIniciales.thickness = 0;
    //     }
    //     if (decimal_.getSelectedIndex() == 1){
    //         ValoresIniciales.thickness = 1;
    //     }
    //     if (decimal_.getSelectedIndex() == 2){
    //         ValoresIniciales.thickness = 2;
    //     }
    // }
    private void mensajeError(){
        JOptionPane.showMessageDialog(null, "Debe ingresar una direccion ip válida", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void verificar(String ip){
        int tamCad = ip.length();
        
        int j = 0;
        if(tamCad>=7 || tamCad <= 15){
            while(j < ip_.length){
                try{
                    String [] octetos = ip.split(".");
                    System.out.println(octetos[j]);
                    ip_[j] = Integer.parseInt(octetos[j]);
                    j++;
                    ban = true;
                }catch(NumberFormatException e){
                    mensajeError();
                    ban = false;
                    break;
                }  

            }
        }else{
            mensajeError();
        }
    }
}
