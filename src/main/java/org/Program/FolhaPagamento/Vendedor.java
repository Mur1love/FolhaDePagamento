package org.Program.FolhaPagamento;

public class Vendedor {
    private String nome;
    private double salarioBase;
    private double vendas;

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public Vendedor() {}

    public Vendedor(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void exibirDadosVendedor(String nome, double salarioBase, double vendas) {
        double comissao = vendas * 0.05;
        System.out.println("FOLHA DE PAGAMENTO DO VENDEDOR:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + (salarioBase + comissao));
    }
}


