/*
 * Faça um programa que leia conjuntos de dois valores. 
 * O primeiro representando o nome do aluno e o segundo representando a idade.
 * Pare o programa somente inserindo o valor 0 no campo nome
 */

 import java.util.Scanner;

 public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) 
                break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
            System.out.println("Nome: " + nome + ", idade: " + idade);
        }
        
        scan.close();
        System.out.println("Fim do programa.");
    }
 }
