/*
 * Nessa versão, permito que o usuário especifique o intervalo de multiplicação,
 * além do número da tabuada. Uso a classe 'Scanner' para receber entrada do usuário
 * e 'printf' para formatar a saída em uma tabela organizada. 
 * 
 * Cabeçalho da tabela: "N" e "R" (Número e Resultado)
 * 
 */

import java.util.Scanner;

public class ex5_VersaoMaisSofisticada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tabuada: ");
        int tabuada = sc.nextInt();

        System.out.print("Começando em: ");
        int inicio = sc.nextInt();

        System.out.print("Terminando em: ");
        int fim = sc.nextInt();

        System.out.printf("%nTabuada de %d de %d a %d:%n%n", tabuada, inicio, fim);

        System.out.printf("%5s | %5s%n", "N", "R");

        System.out.println("-----+-----");

        for (int i = inicio; i <= fim; i++) {
            System.out.printf("%5d | %5d%n", i, tabuada * i);
        }

        sc.close();
    }
}
