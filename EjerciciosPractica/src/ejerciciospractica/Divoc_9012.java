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
public class Divoc_9012 {
    
    public static void main(String[] args){
        
    Scanner covid = new Scanner(System.in);
    double a, b;
    System.out.println("Ingrese el valor de A: ");
    a = covid.nextInt();
    System.out.println("Ingrese el valor de B: ");
    b = covid.nextInt();
    
    if ((1<=a)&&(a<=Math.pow(10,18))&&(1<=b)&&(b<=a)){
        int contador=1;
        while (!(a<=b)){
            a*=1.02;
            b*=1.03;
            contador +=1;
        } System.out.println(contador);
        }else{
            System.out.println("No cumple las condiciones");
        } 
    }  
}
