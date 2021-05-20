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
public class NombresUniversidades {
    public static void main(String[] args){
        Scanner universidad = new Scanner(System.in);
        System.out.println("numero de links");
        int n = Integer.parseInt(universidad.nextLine());
        for (int i=0;i<=n;i++){
        System.out.println("Ingrese los links: ");
        String  datos = universidad.nextLine();
        String[] universidades = datos.split("\\.");
        System.out.println(universidades[1]);
    }
  }
}
