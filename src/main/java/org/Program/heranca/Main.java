package org.Program.heranca;

public class Main {
    public static void main(String[] args) {

        Medico medico = new Medico("Antonio", 30, "Pediatra" );
        medico.mostrarDados();

        Paciente paciente = new Paciente("Jorge", 25, "12345678");
        paciente.mostrarDados();

        Assistente assistente = new Assistente("Pedro", 20, "Matutino");
        assistente.mostrarDados();


    }
}
