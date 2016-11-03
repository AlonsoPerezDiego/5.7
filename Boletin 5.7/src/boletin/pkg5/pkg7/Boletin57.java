package boletin.pkg5.pkg7;

// @author Diego

import javax.swing.JOptionPane;


public class Boletin57 {

    public static void main(String[] args) {
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("Para calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
        int fallos = 0;
        if(op<1|op>2){
           op = Integer.parseInt(JOptionPane.showInputDialog("Te has equivocado. \nPara calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
           fallos = fallos + 1;
           if (fallos!=6){
               op = Integer.parseInt(JOptionPane.showInputDialog("Te has equivocado. \nPara calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
               fallos = fallos + 1;
           }
           else{
               op = 2;
           }
        }
        
        Metodos area = new Metodos();
        while(op==1){
            
            
            int opciones = Integer.parseInt(JOptionPane.showInputDialog("Para calcular el área de un cuadrado teclea '1'. \n Para calcular el área de un triagulo teclea '2'. \n Y para calcular el área de un circulo teclea '3'."));
            switch(opciones){
            
                case 1: area.setCuadrado();
                        area.mostrarCuadrado();
                        op = Integer.parseInt(JOptionPane.showInputDialog("Para volver a calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
                        break;
                case 2: area.setTriangulo();
                        area.mostrarTriangulo();
                        op = Integer.parseInt(JOptionPane.showInputDialog("Para volver a calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
                        break;
                case 3: area.setCirculo();
                        area.mostrarCirculo();
                        op = Integer.parseInt(JOptionPane.showInputDialog("Para volver a calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
                        break;
                default:  System.out.println("Opción incorrecta");
            }
        
            while((opciones<1|opciones>3)&&fallos<=5){
           
                opciones = Integer.parseInt(JOptionPane.showInputDialog("Para calcular el área de un cuadrado teclea '1'. \n Para calcular el área de un triagulo teclea '2'. \n Y para calcular el área de un circulo teclea '3'. \n ¡No teclees otra cosa!"));
            
                switch(opciones){
            
                    case 1: area.setCuadrado();
                            area.mostrarCuadrado();
                            op = Integer.parseInt(JOptionPane.showInputDialog("Para volver a calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
                            break;
                    case 2: area.setTriangulo();
                            area.mostrarTriangulo();
                            op = Integer.parseInt(JOptionPane.showInputDialog("Para volver a calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
                            break;
                    case 3:     area.setCirculo();
                            area.mostrarCirculo();
                            op = Integer.parseInt(JOptionPane.showInputDialog("Para volver a calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
                            break;
                    default: System.out.println("¡Opción incorrecta otra vez! \n ¡Introducelo bien de una vez!");
                             fallos = fallos + 1;
                             System.out.println(fallos);
                             if(fallos==5){
                             op=2;
                             }
                }
            }
    }
        if(fallos!=6){
            System.out.println("Adios.");
        }
        else{
            System.out.println("¡Ya me cansé!\n¡Adios!");
        }
    }
    
    
}
