package org.Program.gestaoVeiculos;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String placa, String marca, double preco, int numPortas) {
        super(placa, marca, preco);
        this.numPortas = numPortas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Numero de Portas: " + numPortas);
    }

    public void mostrarDados(boolean portas) {
        System.out.println("Numero de Portas: " + numPortas);
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
