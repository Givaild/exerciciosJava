/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
 import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,s=0,c=-1,totP=0,totI=0,n100=0;
        int med=0;
        do{
        n=Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe Um Valor: (Valor 0 Interrope) </html>"));
        if(n%2==0&& n!=0) {
            totP++;
        }else if (n!=0){
            totI++;
        }
        if (n>100){
            n100++;
        }    
        s+=n;
        c++;
        }
        while(n!=0);
        med = (s/c);
        JOptionPane.showMessageDialog(null,
                "<html>Resultado Final<br><hr>"+
                        "<br>Soma dos Numeros: "+ s +
                        "<br>Total de Valores: "+ c + 
                        "<br>Total Pares: "+ totP +
                        "<br>Total de Impares: "+ totI +
                        "<br>Acima de 100: "+ n100 +
                        "<br>Média dos Valores: "+ med +
                        "</html>");
        
        
    }
    
}
