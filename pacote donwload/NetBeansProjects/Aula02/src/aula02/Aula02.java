/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Caneta c1 = new Caneta();
        c1.ponta = 0.5f;
        c1.cor = "Azul";
        c1.destampar();
        c1.modelo = "Bic Cristal";
        c1.carga = 90;
        c1.status();
        c1.rabiscar();*/
       Bebida b1 = new Bebida();
       b1.embalagem = "Vidro";
       b1.ml = 300;
       b1.SoMaior();
       b1.marca = "Brahma";
       b1.CascoCheio();
       b1.status();
       
       
        
    }
    
}
