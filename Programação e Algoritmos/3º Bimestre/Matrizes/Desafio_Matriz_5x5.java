public class Desafio_Matriz_5x5 {
    public static void main(String[] args) {

        //Declaração da Matriz A de tamanho 5x5

        int[][] A = {
                {10, 4, 4 , 5 , 3 },
                {12, 5, 12, 21, 12},
                {12, 3, 4 , 5 , 5,},
                {2 , 4, 5 , 3 , 2 },
                {2 , 7, 7 , 9 , 0 }


        };

        //Declaração da matriz B de tamanho 5x5

        int[][] B = {
                {2 , 3 , 4, 5, 7 },
                {14, 8 , 7, 8, 9 },
                {2 , 4 , 8, 9, 12},
                {2 , 12, 4, 7, 9 },
                {22, 12, 8, 7, 5 }
        };

        //Exibindo a Matriz A

        System.out.println("Matriz A: \n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        //Exibindo a Matriz B

        System.out.println("\nMatriz B: \n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        //Declarando as matrizes soma, subtracao e divisao para armazenarem os resultados

        int[][] soma = new int [5][5];
        int[][] subtracao = new int [5][5];
        double [][] divisao = new double [5][5];

        //Calculando a soma e a subtração no mesmo laço, percorrendo as linhas e colunas das matrizes

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma[i][j] = A[i][j] + B[i][j];
                subtracao[i][j] = A[i][j] - B[i][j];
            }
        }


        //Calculando a divisão, percorrendo as linhas e colunas das matrizes

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                // Verifica se o divisor é diferente de zero
                if (B[i][j] != 0) {

                    // Realiza a divisão elemento por elemento
                    divisao[i][j] = (double) A[i][j] / B[i][j];

                } else {

                    // Informa que não é possível dividir por zero
                    System.out.println("Aviso: divisão por zero na posição [" + i + "][" + j + "]");
                    divisao[i][j] = 0;

                    return;
                }

            }

        }

    System.out.println("\nResultados das operações entre as matrizes A e B:");

        // Exibindo o resultado da soma:

        System.out.println("\nSoma:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(soma[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo o resultado da subtração

        System.out.println("\nSubtração:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(subtracao[i][j] + "\t");
            }
            System.out.println();
        }

        //Exibindo o resultado da divisão

        System.out.println("\nDivisão:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(divisao[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
