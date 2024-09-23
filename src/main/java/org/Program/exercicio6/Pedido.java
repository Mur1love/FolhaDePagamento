package org.Program.exercicio6;

public class Pedido {
    private Produto produto;
    private int quantidade;

    public Pedido() {
    }

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularTotalPedido(Produto produto) {
        return produto.getPreco() * quantidade;
    }

    public void exibirPedido() {

        System.out.println("---- NOTA FISCAL ----");
        System.out.println("Nome:       " + produto.getNome());
        System.out.println("Descrição:  " + produto.getDescricao());
        System.out.println("Preço:      " + produto.getPreco());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total:      " + calcularTotalPedido(produto));
    }
}
