/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author usuario
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("cc");
        p1.setNumconta(1111);
        p1.setDono("Jubileu");
        
        
        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("cp");
        p2.setNumconta(2222);
        p2.setDono("Creuza");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        p2.sacar(1000);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
