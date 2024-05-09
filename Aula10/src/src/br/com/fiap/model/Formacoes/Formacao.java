package br.com.fiap.model.Formacoes;

public class Formacao {

    private String descricao;
    private int periodo;
    private double mensalidade;
    private int duracao;

    public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
        this.descricao = descricao;
        this.periodo = periodo;
        this.mensalidade = mensalidade;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao + ", Período: " + periodo + ", Mensalidade: " + mensalidade + ", Duração: " + duracao;
    }

    public void definirDuracao(){
        if(this instanceof Medio){
            this.duracao = 36;
        } else if(this instanceof Tecnologo){
            this.duracao = 24;
        } else if (this instanceof Bacharelado){
            if(this.getDescricao().equalsIgnoreCase("Engenharia")){
                this.duracao = 60;
            } else{
                this.duracao = 48;
            }
        }
    }

    public double calcularMedia(double global1, double global2){
       double media = (global1 * 0.40) + (global2 * 0.60) / 2;
       return media;
    }

    public double calcularMedia(double global1, double chekpoint1, double challenge1, double global2, double chekpoint2, double challenge2){
        double media = (global1 + chekpoint1 + challenge1 + global2 + chekpoint2 + challenge2) / 6;
        return media;
    }

    public double calcularMedia(double checkpoint1, double checkpoint2, double checkpoint3){
        double media;
        if(checkpoint1 < checkpoint2 && checkpoint1 < checkpoint3){
            media = (checkpoint2 + checkpoint3) /2;
        } else if(checkpoint2 < checkpoint1 && checkpoint2 < checkpoint3) {
            media = (checkpoint1 + checkpoint3) /2;
        } else{
            media = (checkpoint1 + checkpoint2) /2;
        }
        return media;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
