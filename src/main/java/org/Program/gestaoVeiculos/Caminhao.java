package org.Program.gestaoVeiculos;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String marca, double preco, double capacidadeCarga) {
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
    }


    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
    }

    public void mostrarDados(boolean medida) {
        if (medida) {
            System.out.println("Capacidade de Carga: " + capacidadeCarga +"Kg");
        } else {
            System.out.println("Capacidade de Carga: " + (capacidadeCarga / 1000) + "T");
        }
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
