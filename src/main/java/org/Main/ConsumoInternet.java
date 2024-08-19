package org.Main;

import java.util.Arrays;
import java.util.Scanner;

public class ConsumoInternet {

    public static int calcularConsumoTotal(String[] consumo) {
        int total = 0;
        for (String c : consumo){
            total += Integer.parseInt(c);
        }
        return total;
    }

   public static  int calcularMediaSemana(String[] consumo) {
        int total = calcularConsumoTotal(consumo);

        return total / consumo.length;
   }

    public static int identificaSemanaMaiorConsumo(String[] consumo) {
        int[] consumoInt = Arrays.stream(consumo)
                .mapToInt(n -> Integer.parseInt(n))
                .toArray();

        int maiorConsumo = consumoInt[0];
        int semanaMaiorConsumo = 0;

        for (int c = 1; c < consumo.length; c++) {
            if (consumoInt[c] > maiorConsumo) {
                maiorConsumo = consumoInt[c];
                semanaMaiorConsumo = c +1;
            }
        }
        return semanaMaiorConsumo;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] consumoSemanal = input.split(",");


        int totalConsumo = calcularConsumoTotal(consumoSemanal);
        int mediaSemanal = calcularMediaSemana(consumoSemanal);
        int semanaMaiorConsumo = identificaSemanaMaiorConsumo(consumoSemanal);

        System.out.println("Total mensal: " + totalConsumo + " MB");
        System.out.println("Media semanal: " + mediaSemanal + " MB");
        System.out.println("Maior consumo: Semana " + semanaMaiorConsumo);

    }


}