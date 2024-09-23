package org.Program.exercicio2;

public class Livro {
    public String titulo;
    public String autor;
    public int quantPag;
    public boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }

    public void exibirInformacoes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.quantPag);
        System.out.println("Emprestado: " + this.emprestado);
    }

}
