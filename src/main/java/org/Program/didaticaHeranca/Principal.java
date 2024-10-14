package org.Program.didaticaHeranca;

public class Principal {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Wolksvagem", "123456", "Fusca");
        Carro carro2 = new Carro("Fiat", "654312", "Uno de firma");
        Carro carro3 = new Carro("Fiat", "123rert", "SUV");

        carro1.mostrarDados();
        System.out.println("-------------");
        carro2.mostrarDados();
        System.out.println("-------------");
        carro3.mostrarDados();
    }
}
