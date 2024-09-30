package org.Program.FolhaPagamento;

public class Gerente {
    private String nome;
    private double salarioBase;
    private boolean bateuAMeta = false;

    public Gerente () {

    }

    public Gerente (String nome, double salarioBase) {
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

    public boolean isBateuAMeta() {
        return bateuAMeta;
    }
                
    public void setBateuAMeta(boolean bateuAMeta) {
        this.bateuAMeta = bateuAMeta;
    }

    public void exibirDadosGerente(String nome, double salarioBase, boolean bateuAMeta) {
        System.out.println("FOLHA DE PAGAMENTO DO GERENTE: ");
        System.out.println("Nome: " + nome);
        if (bateuAMeta) {
            System.out.println("A loja bateu a meta!");
            System.out.println("Salário: " + (salarioBase + (salarioBase * 0.2)));
        } else {
            System.out.println("A loja não bateu a meta.");
            System.out.println("Salário: " + salarioBase);
        }
    }
}
