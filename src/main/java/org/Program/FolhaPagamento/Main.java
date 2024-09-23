package org.Program.FolhaPagamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        AssistenteAdm assistenteAdm = new AssistenteAdm();

        System.out.println("Digite o nome do Gerente: ");
        gerente.setNome(sc.next());
        System.out.println("Digite o salário base do Gerente: ");
        gerente.setSalarioBase(sc.nextDouble());
        System.out.println("A loja bateu a meta de vendas do mes? s/n");
        String resposta = sc.next();
        if (resposta.equals("s")) {
            gerente.setBateuAMeta(true);
        } else {
            gerente.setBateuAMeta(false);
        }
        System.out.println("Digite o nome do Vendedor: ");
        vendedor.setNome(sc.next());
        System.out.println("Digite o salário base do Vendedor: ");
        vendedor.setSalarioBase(sc.nextDouble());
        System.out.println("Digite o valor das vendas do Vendedor: ");
        vendedor.setVendas(sc.nextDouble());
        System.out.println("Digite o nome do Assistente: ");
        assistenteAdm.setNome(sc.next());
        System.out.println("Digite o salário base do Assistente: ");
        assistenteAdm.setSalarioBase(sc.nextDouble());

        gerente.exibirDadosGerente(gerente.getNome(), gerente.getSalarioBase(), gerente.isBateuAMeta());
        vendedor.exibirDadosVendedor(vendedor.getNome(), vendedor.getSalarioBase(), vendedor.getVendas());
        assistenteAdm.exibirDadosAssistenteAdm(assistenteAdm.getNome(), assistenteAdm.getSalarioBase());

    }
}
