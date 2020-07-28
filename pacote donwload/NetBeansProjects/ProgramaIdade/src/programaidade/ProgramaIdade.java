/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano de seu Nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2018-nasc;
        if (idade <18){
            System.out.println("Você tem "+idade+" Anos e é menor de idade ");
        }
            else{
                    System.out.println("Você tem "+idade+" Anos e já é maior de idade");
                    }
        
    }
    
}
