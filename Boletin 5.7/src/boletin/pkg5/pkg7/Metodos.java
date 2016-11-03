package boletin.pkg5.pkg7;

import javax.swing.JOptionPane;

public class Metodos {
    
    private double lado, base, altura, radio;
    private final double Pi = 3.1415926535897932384626433832795;
    
    public Metodos(){
    }
    
    public Metodos(double l, double b, double a, double r){
        
        lado = l;
        base = b;
        altura = a;
        radio = r;
    }
    
    public void setCuadrado(){
        lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado"));
        
        while(lado<=0){
            lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado (mayor que 0)"));
        }
    }
    
    public void mostrarCuadrado(){
        System.out.println( "El área del cuadrado es igual a " + (Math.pow(lado, 2)) + "cm^2");
    }
    
    public void setTriangulo(){
       base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
       altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
       
       while(base<=0|altura<=0){
           base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base (mayor que 0)"));
           altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura (mayor que 0)"));  
       }
    }
    
    public void mostrarTriangulo(){
        System.out.println( "El área del triángulo es igual a " + (base*altura/2) + "cm^2");
    }
    
    public void setCirculo(){
        radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
        while(radio<=0){
            radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio (mayor que 0)"));
        }
    }
    
    public void mostrarCirculo(){
        System.out.println( "El área del círculo es igual a " + (Pi*(Math.pow(radio, 2))) + "cm^2");
    }
    
}
