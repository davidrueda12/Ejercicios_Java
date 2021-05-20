/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractica;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EjerciciosPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        int a, b, c, d;
            a = sc.nextInt();
            System.out.println("Ingrese el valor de B: ");
            b = sc.nextInt();
            System.out.println("Ingrese el valor de C: ");
            c = sc.nextInt();
            System.out.println("Ingrese el valor de D: ");
            d = sc.nextInt();
            
        if ((b>c) && (d>a) && ((c+d)>(a+b)) && (d > 0) && (c > 0) && (a%2 == 0)){
            
        System.out.println("Valores aceptados");
                 
        } else{
        System.out.println("Valores no aceptados");
        }
    }
}
