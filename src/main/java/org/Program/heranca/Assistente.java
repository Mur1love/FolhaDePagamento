package org.Program.heranca;

public class Assistente extends Pessoa {
    private String turno;

    public Assistente(String nome, int idade, String turno) {
        super(nome, idade);
        this.turno = turno;
    }

    @Override
    public void mostrarDados(){
        System.out.println("DADOS DO ASSISTENTE:");
        super.mostrarDados(true);
        System.out.println("Turno: " + turno);
    }

    public Assistente(String turno) {
        this.turno = turno;
    }
}
