package org.Program.exercicio1;

public class Aluno {
    String nome;
    int    matricula;
    float  nota1;
    float  nota2;

    public float calcularMedia(float nota1, float nota2) {
        return (nota1 + nota2) / 2;
    }

    public String exibirSituacao(float nota1, float nota2) {

        float media = calcularMedia(nota1, nota2);

        String situacao = "";
        if (media >= 7) {
            return situacao = "Aprovado";
        } else if (media < 3 & media < 7) {
            return situacao = "Final";
        } else {
            return situacao = "Final";
        }
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota: " + nota1);
        System.out.println("Nota: " + nota2);
        System.out.println("Media: " + calcularMedia(nota1, nota2));
        System.out.println("Situação: " + exibirSituacao(nota1, nota2));

    }
}
