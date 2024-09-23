package org.Program.exercicio6;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Feijão", 10.0, "Preto");

        Pedido pedido1 = new Pedido(produto1, 2);

        pedido1.exibirPedido();


    }
}
