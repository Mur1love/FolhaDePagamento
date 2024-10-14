package org.Program.lacos;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("01", "Arroz", true, 1, 10);
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("MENU:");
            System.out.println("1. Imprimir Dados");
            System.out.println("2. Identificar Tipo");
            System.out.println("0. Sair");
            int menu = sc.nextInt();
            if (menu == 1) {
                p1.mostrarDados();
            } else if (menu == 2) {
                p1.indentificarTipo();
            } else if (menu == 0) {
                System.out.println("Programa finalizado.");
                break;
            } else {
                System.out.println("Valor Invalido. Tente Novamente");
            }
        }
    }
}
