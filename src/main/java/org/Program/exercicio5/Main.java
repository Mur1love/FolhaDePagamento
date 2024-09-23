package org.Program.exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();

        Pessoa pessoa2 = new Pessoa();

        System.out.println("Digite o nome da primeira pessoa: ");
        pessoa1.setNome(sc.next());
        System.out.println("Digite a idade da primeira pessoa: ");
        pessoa1.setIdade(sc.nextInt());
        System.out.println("Digite a profissão da primeira pessoa: ");
        pessoa1.setProfissao(sc.next());

        System.out.println("Digite o nome da segunda pessoa: ");
        pessoa2.setNome(sc.next());
        System.out.println("Digite a idade da segunda pessoa: ");
        pessoa2.setIdade(sc.nextInt());
        System.out.println("Digite a profissão da segunda pessoa: ");
        pessoa2.setProfissao(sc.next());


        System.out.println("- Primeira Pessoa -  ");
        pessoa1.exibirDados();

        System.out.println();

        System.out.println("- Segunda Pessoa - ");
        pessoa2.exibirDados();

    }
}
