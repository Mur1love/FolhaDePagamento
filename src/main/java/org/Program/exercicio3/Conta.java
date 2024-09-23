package org.Program.exercicio3;

public class Conta {
    String nome;
    String numeroDaConta;
    double saldo;


    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Numero da conta: " + numeroDaConta);
        System.out.println("Saldo: " + saldo);
    }
}
