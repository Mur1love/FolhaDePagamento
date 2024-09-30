package org.Program.GestaoProdutos;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;


    public void mostrarDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
    }

    public void mostrarDados(double desconto) {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Total:  R$" + (preco - desconto));
    }


    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
