package main.Algoritmos;

import javax.swing.JOptionPane;

public class ClassRed extends Red{
    Integer [] octetos_;
    String cadIP;
    String[] ip;
    long []binario;
    boolean ban = false;
    boolean ban1 = false;
    int C1, H, S, sal;
    int n, n1;
    int oc1, oc2, oc3, oc4;
    int TS = 0;
    int TH= 0;
    int A,B,C,D;

    public ClassRed(Integer[] octetos_){
        this.octetos_ = octetos_;
        ip = new String[4];
        binario = new long[4];
        ban = false;
        ban1 = false;
        sal = 0;
        oc1= 0; 
        oc2 = 0;
        oc3 = 0;
        oc4 = 0;
        TS = 0;
        TH= 0;
    }
    
    public String claseRed(){
        String redclass = "";
        if(octetos_[0]>= 1 && octetos_[0] < 127){
            redclass = getRed()+"//"+ " Clase A";
        }else if(octetos_[0]>= 127 && octetos_[0] < 192){
            redclass = getRed()+" //"+ " Clase B";
        }else if(octetos_[0]>= 192 && octetos_[0] < 224){
            redclass = getRed() +" //"+ " Clase C";
        }else if(octetos_[0]>= 224 && octetos_[0] < 240){
            redclass = getRed() +" //"+ " Clase D";
        }else if(octetos_[0]>= 240 && octetos_[0] < 256){
            redclass = getRed() +" //"+ " Clase E";
        }else{
            message("Direccion de red invalida!!");
        }
        return redclass;
    }

    private String getRed(){
        String red = "";
        for(int i = 0; i<octetos_.length; i++){
            if(i == octetos_.length - 1){
                red = red + octetos_[i];
            }
            else{
                red = red +"." +octetos_[i];
            }
        }
        return red;
    }
   
    //Metodos auxiliares
    private void message(String mensaje){
         JOptionPane.showMessageDialog(null,mensaje);
    }
    
    public String cadIPV(){
        String cad = "";
        for(int i = 0;i < ip.length; i++){
            cad = cad + "\n " + ip[i];
        }
        return cad;
    }
    
    public String cadIPB(){
        String cad = "";
        for(int i = 0;i < ip.length; i++){
            cad = cad +"|"+ binario[i];
        }
        return cad;
    } 
    
    //Inicializar algoritmo
    @Override
    public void run(){
        claseRed();
    }
}
