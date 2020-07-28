/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author usuario
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[]= {3,2,8,7,5,4};
        System.out.println("O meu vetor tem: "+n.length+" Posições");
        for(int c=0;c<=n.length-1;c++){//contador
            System.out.println("na posição: " +c+" Temos: "+n[c]);//mostrar o numero na posição do contador    
        }
        
    }
    
}
