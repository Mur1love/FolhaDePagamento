package org.Program.lacos;

public class Produto {
    private String id;
    private String nome;
    private boolean tipo;
    private int quantidade;
    private double preco;

    public Produto(String id, String nome, boolean tipo, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        if (tipo) {
            System.out.println("Tipo: Perecível");
        } else {
            System.out.println("Tipo: Não-Perecível");
        }
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preco: " + preco);
    }

    public void indentificarTipo() {
        if (tipo) {
            preco = preco + 2;
            System.out.println("Tipo: Perecível");
        } else {
            System.out.println("Tipo: Não Perecível");
        }
    }
}
