package org.Program.exercicio1;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Murilo";
        aluno1.matricula = 12345;
        aluno1.nota1 = 5;
        aluno1.nota2 = 7;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Enriko";
        aluno2.matricula = 54321;
        aluno2.nota1 = 2;
        aluno2.nota2 = 3;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "David";
        aluno3.matricula = 98765;
        aluno3.nota1 = 8;
        aluno3.nota2 = 7;

        aluno1.exibirDados();

        System.out.println();

        aluno2.exibirDados();

        System.out.println();

        aluno3.exibirDados();

    }
}
