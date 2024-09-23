package org.Program.exercicio3;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.nome = "Murilo";
        conta.numeroDaConta = "12345";
        conta.saldo = 1000;

        conta.depositar(500);

        conta.exibirDados();

        System.out.println();

        conta.sacar(600);

        conta.exibirDados();

    }
}
