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
public class EjerciciosDiaDia {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el numero de dias: ");
        int n, x, y, z;
            n = sc.nextInt();
            x = (n/365);
            y = ((n%365)/30);
            z = ((n%365)%30);
        System.out.println("Años: " + x + "Meses: " + y + "Dias: " + z);
        
    }
    
}
