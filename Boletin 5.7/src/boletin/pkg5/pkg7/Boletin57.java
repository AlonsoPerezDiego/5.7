package boletin.pkg5.pkg7;

// @author Diego

import javax.swing.JOptionPane;


public class Boletin57 {

    public static void main(String[] args) {
        
        int fallos = 0;
        int opciones = Integer.parseInt(JOptionPane.showInputDialog("Para calcular el área de un cuadrado teclea '1'. \n Para calcular el área de un triagulo teclea '2'. \n Y para calcular el área de un circulo teclea '3'."));
        
        Metodos area = new Metodos();
        switch(opciones){
            
            case 1: area.setCuadrado();
                    area.mostrarCuadrado();
                    break;
            case 2: area.setTriangulo();
                    area.mostrarTriangulo();
                    break;
            case 3: area.setCirculo();
                    area.mostrarCirculo();
                    break;
            default:  JOptionPane.showMessageDialog(null, "Opción incorrecta");
        }
        
        while((opciones<1|opciones>3)&&fallos<=5){
           
            opciones = Integer.parseInt(JOptionPane.showInputDialog("Para calcular el área de un cuadrado teclea '1'. \n Para calcular el área de un triagulo teclea '2'. \n Y para calcular el área de un circulo teclea '3'. \n ¡No teclees otra cosa!"));
            
            switch(opciones){
            
                case 1: area.setCuadrado();
                        area.mostrarCuadrado();
                        break;
                case 2: area.setTriangulo();
                        area.mostrarTriangulo();
                        break;
                case 3: area.setCirculo();
                        area.mostrarCirculo();
                        break;
                default:  JOptionPane.showMessageDialog(null, "¡Opción incorrecta otra vez! \n ¡Introducelo bien de una vez!");
                fallos = fallos + 1;
                    System.out.println(fallos);

            }
        }
        
        if(fallos!=6){
        JOptionPane.showMessageDialog(null, "Adios.");
        }
        else{
            JOptionPane.showMessageDialog(null, "¡Ya me cansé!\n¡Adios!");
        }
    }
    
}
