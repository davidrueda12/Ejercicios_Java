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
public class CompetenciaFacil {
    public static void main(String[] args){
        Scanner competencia = new Scanner(System.in);
        System.out.println("Cantidad numeros: ");
        int n = Integer.parseInt(competencia.nextLine());
        System.out.println("Ingrese los numeros: ");
        String  datos = competencia.nextLine();
        //String[] numeros = datos.split(" ");
        //list-java doc
        if (datos.contains("1")){
            System.out.println("Competencia dificil");
        }else{
            System.out.println("Competencia facil");
        }
      }  
    }
  

