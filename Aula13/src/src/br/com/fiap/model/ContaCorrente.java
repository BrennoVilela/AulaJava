package br.com.fiap.model;

public class ContaCorrente {
    private double saldo;
    private double limite;

    public ContaCorrente(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    public double sacar(double valor) throws Exception {
        if(valor > this.getSaldo()) {
            throw new Exception("Você não tem saldo o suficiente");
        }
        return (this.getSaldo() - valor);
    }

    public double depositar(double valor) throws Exception {
        if(valor < 1) {
            throw new Exception("Não é possivel depositar um valor negativo");
        }
        return (this.getSaldo() + valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
