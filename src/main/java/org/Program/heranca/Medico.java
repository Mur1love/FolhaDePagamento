package org.Program.heranca;

public class Medico extends Pessoa {
    private String especialidade;

    public Medico(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarDados() {
        System.out.println("DADOS DO MÉDICO: ");
        super.mostrarDados(); //Mostra os dados do método original
        System.out.println("Especialidade: " + especialidade); //Mostra os dados da subclasse
    }

    public Medico(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
