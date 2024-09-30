package org.Program.heranca;

public class Main {
    public static void main(String[] args) {

        Medico medico = new Medico("Antonio", 30, "Pediatra" );
        medico.mostrarDados();
        System.out.println("------------------");
        Paciente paciente = new Paciente("Jorge", 25, "12345678");
        paciente.mostrarDados();
        System.out.println("------------------");
        Assistente assistente = new Assistente("Pedro", 20, "Matutino");
        assistente.mostrarDados();


    }
}
