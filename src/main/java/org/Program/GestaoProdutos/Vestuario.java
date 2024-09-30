package org.Program.GestaoProdutos;

public class Vestuario extends Produto {
    private String tamanho;
    private String cor;


    @Override
    public void mostrarDados() {
        System.out.println("DADOS DO VESTUARIO: ");
        super.mostrarDados();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
    }

    public void mostrarDados(boolean temCor){
        System.out.println("DADOS DO VESTUARIO: ");
        super.mostrarDados();
        System.out.println("Tamanho: " + tamanho);
        if(temCor){
            System.out.println("Cor: " + cor);
        }
    }

    public Vestuario(String codigo, String nome, double preco, String tamanho, String cor) {
        super(codigo, nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Vestuario(String tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
