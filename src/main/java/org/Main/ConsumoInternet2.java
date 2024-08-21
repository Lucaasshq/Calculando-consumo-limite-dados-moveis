package org.Main;

import java.util.Scanner;

public class ConsumoInternet2 {

    public static int gbParaMb(int gb){
        return gb * 1024;

    }

    public static void verificarLimiteDados(int limiteGb, int consumoTotalMb) {
        int limitemb = gbParaMb(limiteGb);

        if (consumoTotalMb > limitemb) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            int dadosRestantes = limitemb - consumoTotalMb;
            System.out.println("Você ainda possui " + dadosRestantes + " MB disponiveis.");
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limiteGb = entrada.nextInt();
        entrada.nextLine();

        int consumoTotalMb = entrada.nextInt();

        verificarLimiteDados(limiteGb, consumoTotalMb);

        entrada.close();
    }
}
