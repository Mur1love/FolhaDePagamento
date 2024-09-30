package org.Program.GestaoProdutos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Produto produto = new Produto("P001", "Churrasqueira", 1000);
        Eletronico eletronico = new Eletronico("E001", "Geladeira", 3000, 3);
        Vestuario vestuario = new Vestuario("V001", "Casaco", 250, "Grande", "Azul");
        Alimento alimento = new Alimento("A001", "Miojo", 3, "10/12/2026");

        produto.mostrarDados();
        produto.mostrarDados(200);

        System.out.println("------------------");

        eletronico.mostrarDados();
        eletronico.mostrarDados(true);

        System.out.println("------------------");

        vestuario.mostrarDados();
        vestuario.mostrarDados(true);

        System.out.println("------------------");

        alimento.mostrarDados();
        alimento.mostrarDados(true);





    }
}
