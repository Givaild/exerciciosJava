/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author usuario
 */
public class Bebida {
    float ml;
    boolean alcolica;
    boolean cheia;
    String marca;
    String embalagem;
    
      void SoMaior(){
      this.alcolica = true; 
}
        void CascoCheio(){
        this.cheia = true;
        
    }
    void CascoVazio(){
        this.cheia = false;
    }
    
    void status(){
        System.out.println("A bebida é da marca "+this.marca);
        System.out.println("é "+this.alcolica);
        System.out.println("Esta "+this.cheia);
        System.out.println("e sua embalagem é de "+this.embalagem);
    }
}
