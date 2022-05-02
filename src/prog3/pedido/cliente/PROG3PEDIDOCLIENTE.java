/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog3.pedido.cliente;

/**
 *
 * @author Sergio
 */
public class PROG3PEDIDOCLIENTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Convertir de String a numero");
       String numCadena="1";
       int numEntero=Integer.parseInt(numCadena);
       System.out.println(numEntero);
       
       System.out.println("Convertir de numero a string");
       numCadena=String.valueOf(numEntero);
       System.out.println(numCadena);
    
       
       
       
}
}