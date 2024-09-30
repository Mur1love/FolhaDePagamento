package org.Program.heranca;

public class Paciente extends Pessoa {
    private String cartaoSUS;

    public Paciente(String nome, int idade, String cartaoSUS) {
        super(nome, idade);
        this.cartaoSUS = cartaoSUS;
    }

    @Override
    public void mostrarDados(){
        System.out.println("DADOS DO PACIENTE: ");
        super.mostrarDados();
        System.out.println("Cartão SUS: " + cartaoSUS);
    }

    public Paciente(String cartaoSUS) {
        this.cartaoSUS = cartaoSUS;
    }
}
