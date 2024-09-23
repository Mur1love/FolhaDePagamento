package org.Program.exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno1.setNome(sc.nextLine());

        System.out.println("Digite o seu curso: ");
        aluno1.setCurso(sc.nextLine());

        System.out.println("Digite a sua matrícula: ");
        aluno1.setMatricula(sc.nextLine());

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("Matricula: " + aluno1.getMatricula());


        Aluno aluno2 = new Aluno("David", "Computação", "12345");

        System.out.println("Aluno 2: ");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Curso: " + aluno2.getCurso());
        System.out.println("Matricula: " + aluno2.getMatricula());

    }
}
