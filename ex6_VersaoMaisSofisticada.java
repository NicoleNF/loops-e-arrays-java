import java.util.Scanner;

public class ex6_VersaoMaisSofisticada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro positivo para calcular o fatorial:");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("Erro: O número digitado deve ser positivo!");
            scanner.close();
            return;
        }
        
        int fatorial = calcularFatorial(numero);
        
        System.out.printf("%d! = %d", numero, fatorial);
        
        scanner.close();
    }
    
    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        
        return fatorial;
    }
}
