package boletin.pkg5.pkg7;

// @author Diego

import javax.swing.JOptionPane;


public class Boletin57 {

    public static void main(String[] args) {
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("Para calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
        int fallos = 0;//variable para cuando se equivoque alguien
        if(op<1|op>2){
           op = Integer.parseInt(JOptionPane.showInputDialog("Te has equivocado. \nPara calcular un área teclea '1'. \n Para cerrar el programa teclea '2'."));
           fallos = fallos + 1;
           if (fallos!=7){
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
        
            while((opciones<1|opciones>3)&&fallos<=6){
           
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
                             if(fallos==6){
                             op=2;
                             }
                }
            }
    }//mucho rollo para muy poco
        if(fallos!=7){
            System.out.println("Adios.");//fin
        }
        else{
            //Demasiados fallos...
            System.out.println("¡Ya me cansé!\n¡Adios!");//fin forzado
        }
    }
    
    
}
