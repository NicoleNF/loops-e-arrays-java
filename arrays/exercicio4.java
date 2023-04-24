/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9
 * 
 */

package arrays;

import java.util.Random;

public class exercicio4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++) {
            for( int j = 0; < M[i].length; j++)
                m[i][j] = rando.nextInt(bound: 9);

        }

    }

    for(int[] linha : M  ) {
        for(int elementoDaColuna : linha ) {
            System.out.println(coluna + "");
        }
        System.out.println();
}

}

}
