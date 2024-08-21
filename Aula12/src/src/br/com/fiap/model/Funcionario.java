package br.com.fiap.model;

import br.com.fiap.exception.MesesInvalidoException;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularFerias(int dias) throws Exception {
        if(dias  < 1 || dias > 30) {
            throw new MesesInvalidoException("Quantidade de dias inválida");
        }
        return (salario + salario/3)*dias/30;
    }

    public double calcularPlr(boolean metaBatida, int meses) throws Exception {
        if (meses < 1 || meses > 12) {
            throw new Exception("Quantidade de meses inválido");
        }
        if(metaBatida) {
            return salario * 5 * meses/12;
        }
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario() {

    }
}
