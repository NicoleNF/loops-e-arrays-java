/* 
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
*/

package exercicios;

public class exercicio1 {
    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("Vetor: ");
        int count = 0;

        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        
        System.out.print("\nVetor invertido: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
