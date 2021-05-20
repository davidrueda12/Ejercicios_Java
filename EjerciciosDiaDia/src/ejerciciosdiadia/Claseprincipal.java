/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdiadia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Claseprincipal {
    
    int sumar(int a, int b){
        int suma = a+b;
        return suma;   
    }
    
    double CalcularAreaCirculo(double radio){
        double area = radio * radio * 3.1416;
        return area;
    }
    
    void mostrarMenu(String nombre){
         System.out.println("Hola, Bienvenido " + nombre); 
         System.out.println("Ingrese 1 para agregar producto, 2. Para pagar, 3. Para salir");
    }
    
    public static void main(String[] args){
        String nombre;
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre:");
        nombre = lector.nextLine();
        String apellido = lector.nextLine();
        System.out.println("Por favor ingrese su edad:");
        int edad = Integer.parseInt(lector.nextLine());
        System.out.println("Buenas tardes "+nombre + " " + apellido + " " + "su edad es"+ " " + edad);
       
    }
}
