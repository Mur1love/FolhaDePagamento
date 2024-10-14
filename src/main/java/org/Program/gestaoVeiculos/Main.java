package org.Program.gestaoVeiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Não consegui pensar em outra maneira de fazer o usuario
        // cadastrar multiplos veiculos até que o usuario decida encerrar
        // sem usar ArrayList ou Array. Precisava salvar os objetos em algum lugar.
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        while (true) {
            System.out.println("Escolha um tipo de veiculo e cadastre: ");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhão");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();

            if (opcao == 0) {
                break;
            }

            System.out.println("Digite a placa: ");
            String placa = sc.next();
            System.out.println("Digite a marca: ");
            String marca = sc.next();
            System.out.println("Digite o preço: ");
            double preco = sc.nextDouble();

            if (opcao == 1) {
                System.out.println("Digite o número de portas do carro: ");
                int numPortas = sc.nextInt();
                Carro c1 = new Carro(placa, marca, preco, numPortas);
                veiculos.add(c1);
                System.out.println("Veiculo Cadastrado com Sucesso!");
                continue;
            } else if (opcao == 2) {
                System.out.println("Digite a cilindrada da moto: ");
                int cc = sc.nextInt();
                Moto m1 = new Moto(placa, marca, preco, cc);
                veiculos.add(m1);
                System.out.println("Veiculo Cadastrado com Sucesso!");
                continue;
            } else if (opcao == 3) {
                System.out.println("Digite a capacidade de carga em Kg: ");
                double capacidadeCarga = sc.nextDouble();
                Caminhao ca1 = new Caminhao(placa, marca, preco, capacidadeCarga);
                veiculos.add(ca1);
                System.out.println("Veiculo Cadastrado com Sucesso!");
                continue;

            } else {
                System.out.println("Opção Inválida. Tente Novamente");
                continue;
            }

        }
        System.out.println("Veiculos cadastrados: ");
        for (Veiculo veiculo : veiculos) {
            veiculo.mostrarDados();
            System.out.println("------------------");
        }

    }
}
