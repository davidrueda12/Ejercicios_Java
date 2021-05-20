/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoscalificable;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Groot {
    
    public static String Groot(int n){
        Scanner ez = new Scanner(System.in);
        System.out.println("Cantidad numeros:");
        n = Integer.parseInt(ez.nextLine());
        String s="";
        for (int i = 1; i < n; i++) {
            if(i%2==0) s+="that I am ";
            if(i%2!=0) s+="that I groot ";
            else {
                  if(i==1) s+= "";
                 }
        } return s;
    
    }
    
    public static void main(String[] args) {
    System.out.println("I am " + Groot(0) + "it");
    }
}
