package br.com.fiap.lavanderia.model;

public class Cliente extends Pessoa{

    private boolean assinante;

    public void pagar(double valor, String nome) {
        //Se for assinante tem 10% de desconto
        if(assinante) {
            valor *= 0.9;
            System.out.println(nome + "Você tem desconto!, valor final: " + valor);
        } else {
            System.out.println(nome + "Você não tem desconto, valor final: " + valor);
        }
    }

    public boolean isAssinante() {
        return assinante;
    }

    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }
}
