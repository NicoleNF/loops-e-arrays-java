/*
 * Faça um programa que peça uma nota, entre zero e dez. 
 * Mostre uma mensagem caso o valor seja inválido e 
 * continue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class ex2_VersaoMaisSofisticada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = -1; /*Inicializando com uma variável inválida para que o laço seja executado pelo menos 1 vez */

        while (nota < 0 | nota > 10) {
            try {
                System.out.print("Digite uma nota entre 0 e 10: ");
                nota = Double.parseDouble(sc.nextLine().replace(',', '.')); /*Para que o programa aceite o separador decimal , ou . */
                if (nota < 0 | nota > 10) {
                    System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido."); /*Tratamento de exceção, valor inválido retorna pro while */
            }
        }

        System.out.println("A nota digitada foi: " + nota);
    }
}
