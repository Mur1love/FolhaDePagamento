package org.Program.didaticaHeranca;

public class Veiculo {

    private String marca;
    private String placa;

    public Veiculo(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
    }

    public void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Placa: " + placa);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
