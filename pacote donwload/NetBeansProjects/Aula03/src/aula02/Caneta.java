package aula02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author usuario
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Uma Caneta Modelo "+this.modelo);
        System.out.println(" de Cor "+this.cor);
        System.out.println(" Ponta "+this.ponta);
        System.out.println(" Carga "+this.carga+"%");
        System.out.println(" Esta tampada? "+this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada==true){
            System.out.println("ERRO!! Não Posso Rabiscar");
        }else{
            System.out.println("ESTOU RABISCANDO!!!");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
}
