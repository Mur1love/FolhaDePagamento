package org.Program.GestaoProdutos;


public class Alimento extends Produto {

    private String dataValidade;


    @Override
    public void mostrarDados(){
        System.out.println("DADOS DO ALIMENTO: ");
        super.mostrarDados();
        System.out.println("Data: " + dataValidade);
    }
    public void mostrarDados(boolean estaPertoDeVencer) {
        System.out.println("DADOS DO ALIMENTO: ");
        super.mostrarDados();
        if (estaPertoDeVencer) {
            System.out.println("O alimento está perto do vencimento");
        }
    }

    public Alimento(String codigo, String nome, double preco, String dataValidade) {
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public Alimento(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
