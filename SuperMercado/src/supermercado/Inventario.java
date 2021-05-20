/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList();
    }

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProductos(Producto p){
        productos.add(p);
    }
    
    public void listarProductos(){
        System.out.println("----Inventario-----");
        for (Producto p : productos) {//este es el for de python for element in lista
            System.out.println(p.toString());
            
        }
        
        //Este seria el for normalito si el anterior es muy confuso
//        for (int i = 0; i < productos.size(); i++) {
//            productos.get(i).toString();
//        }
        
    }
    
    public void procesarComandos(){
        Scanner s= new Scanner(System.in);
        System.out.println("Ingrese los siguientes comandos segun lo requerido:");
        System.out.println("1. Agrega Productos, 2. Lista los productos ingresados y 3. Termina el proceso");
        System.out.println("Para ingresar productos porfavor siga el siguiente formato 1&id del producto&nombre&cantidad&precio&tipo");
        String comando[]=new String[1000];
        String bandera="activo";
        while(bandera!="terminar"){
            comando=s.nextLine().split("&");
            if(comando[0].equals("1")){
                Producto p= new Producto();
                p.setIdProducto(Integer.parseInt(comando[1]));
                p.setNombreProducto(comando[2]);
                p.setCantidad(Integer.parseInt(comando[3]));
                p.setPrecio(Integer.parseInt(comando[4]));
                p.setTipo(comando[5]);
                agregarProductos(p);
            }   
            if(comando[0].equals("2")){
                listarProductos();
            }
            if(comando[0].equals("3")){
                bandera="terminar";
            }
       }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Inventario().procesarComandos();
    }
    
}
