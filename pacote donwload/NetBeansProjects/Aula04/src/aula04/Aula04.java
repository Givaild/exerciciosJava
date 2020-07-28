/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author usuario
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Caneta c1 = new Caneta();
        c1.setPonta(0.5f);
        c1.setModelo("Bic");
        //c1.status();
        System.out.println("Tenho uma caneta: "+c1.getModelo()+" e de ponta: "+
                c1.getPonta());*/
        
       Caneta c1 = new Caneta();
        System.out.println("Tenho uma caneta "+c1.getModelo()+ " de ponta "
                +c1.getPonta()+" Esta Tampada? "+c1.isTampada()
        +" de cor : "+c1.getCor());
       
        
    }
    
}
