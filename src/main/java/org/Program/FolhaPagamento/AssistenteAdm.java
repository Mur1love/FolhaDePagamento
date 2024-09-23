package org.Program.FolhaPagamento;

public class AssistenteAdm {
    private String nome;
    private double salarioBase;

    public AssistenteAdm() {}

    public AssistenteAdm(String nome, double salarioBase) {
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

    public void exibirDadosAssistenteAdm(String nome, double salarioBase) {
        System.out.println("FOLHA DE PAGAMENTO DO ASSISTENTE ADM:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salarioBase);
    }
}
