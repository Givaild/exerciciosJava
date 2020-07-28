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
public class ContaBanco {

    public int numconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumconta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Proprietario: " + this.getDono());
        System.out.println("Saldo Atual: " + this.getSaldo());
        System.out.println("Status " + this.isStatus());

    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = (false);
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc") {
            this.setSaldo(50f);
        } else if (t == "cp") {
            this.setSaldo(150f);

        }

        System.out.println("Conta Aberta com Sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque Possui Dinheiro");
            if (this.getSaldo() < 0) {
                System.out.println("Conta não pode ser fechada possui Débitos");
            }
        } else {
            this.setStatus(false);

            System.out.println("Conta Fechada com Sucesso");

        }
    }

    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de :" + this.getDono());
        } else {
            System.out.println("Conta não existe");
        }
    }

    public void sacar(float r) {
        if (this.isStatus()) {
            if (this.getSaldo() >= r) {
                this.setSaldo(this.getSaldo() - r);
                System.out.println("Saque Realizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente para saque");
            }
        } else {
            System.out.println("Conta Inexistente");
        }
    }

    public void pagarMensalidade() {
        float v = 0;
        if (this.getTipo() == "cc") {
            v = 12;
        } else if (this.getTipo() == "cp") {
            v = 20;
        }

        if (this.isStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade Paga por: " + this.dono);
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta Inexistente");
        }

    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int n) {
        this.numconta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

}
