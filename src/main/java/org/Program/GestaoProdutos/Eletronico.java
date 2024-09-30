package org.Program.GestaoProdutos;

public class Eletronico extends Produto {
    private int garantia;


    @Override
    public void mostrarDados() {
        System.out.println("DADOS DO ELETRONICO: ");
        super.mostrarDados();
    }

    public void mostrarDados(boolean temGarantia) {
        System.out.println("DADOS DO ELETRONICO: ");
        super.mostrarDados();
        if (temGarantia) {
            System.out.println("Garantia: " + garantia + " meses.");
        }
    }

    public Eletronico(String codigo, String nome, double preco, int garantia) {
        super(codigo, nome, preco);
        this.garantia = garantia;
    }

    public Eletronico(int garantia) {
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
