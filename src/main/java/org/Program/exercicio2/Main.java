package org.Program.exercicio2;

public class Main {
    public static void main(String[] args) {


        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.quantPag = 240;
        livro1.exibirInformacoes();
        System.out.println();

        livro1.emprestar();

        System.out.println("Pegando livro emprestado...");
        System.out.println();

        livro1.exibirInformacoes();
        System.out.println(             );

        livro1.devolver();

        System.out.println("Devolvendo livro...");
        System.out.println();

        livro1.exibirInformacoes();

    }
}