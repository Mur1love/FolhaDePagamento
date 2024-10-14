package org.Program.didaticaHeranca;

public class Carro extends Veiculo {

    private String modelo;

    public Carro(String modelo, String marca, String placa) {
        super(marca, placa);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
