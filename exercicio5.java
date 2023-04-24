/*
 * Desenvolva um gerador de tabuada capaz de 
 * gerar a tabuada de qualquer número inteiro entre 1 e 10;
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo:
 * 
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * -----
 * 5 x 10 = 50
 */

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner (System.in)) {
    
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada + ":");

        for(int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }


    }

}

}