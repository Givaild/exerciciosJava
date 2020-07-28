/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite Seu Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite Sua Nota: ");
        float nota =teclado.nextFloat();
        System.out.println("Sua Nota é " + nota );//Saida com quebra de Linha
        System.out.printf("A Nota de %s  é %.1f \n",nome, nota);/*Saida Formatada
        * duas casas decimais(depois da virgula e quebra de linha /n */
    }
    
}
