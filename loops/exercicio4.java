/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números ímpares.
 */

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;


        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;

        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade ímpar: " + quantImpares);

    }
}

}