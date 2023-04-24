/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 * armazene-os em um vetor e ao final mostre os números e seus sucessores e antecessores.
 */

package arrays;

import java.util.Random;

public class exercicio3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0 ; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("Sucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.print("Antecessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
    }
}

}
