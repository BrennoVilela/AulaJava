package br.com.fiap.tds.model;

public class Elevador {

    private int andarAtual;
    private int quantidadeAndar;
    private int capacidade;
    private int pessoasPresentes;

    public void inicializa(int capacidade, int quantidadeAndar) {
        this.capacidade = capacidade;
        this.quantidadeAndar = quantidadeAndar;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador");
        } else {
            System.out.println("O elevador está cheio, não é possivel entrar");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador");
        } else {
            System.out.println("O elevador está vazio!");
        }
    }

    public void sobe() {
        if (andarAtual < quantidadeAndar) {
            andarAtual++;
            System.out.println("O elevador subiu 1 andar");
        } else {
            System.out.println("O elevador já está no ultimo andar.");
        }
    }

    public void desce(){
        if (andarAtual > 0){
            andarAtual--;
            System.out.println("O elevador desceu 1 andar");
        } else {
            System.out.println("O elevador já está no térro.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
}
