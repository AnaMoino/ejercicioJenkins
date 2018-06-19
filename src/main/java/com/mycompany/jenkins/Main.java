/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jenkins;

/**
 *
 * @author siamp-amoino
 */
public class Main {
    
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        sumarNumeros sumar = new sumarNumeros();
        int c = sumar.sumaNumeros(a, b);
        System.out.println("La suma de los numeros fue: "+c); 
    }
    
}
