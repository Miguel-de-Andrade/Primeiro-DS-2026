public class Matriz_5x5 {

    public static void main(String[] args) {

        //Declaração da Matriz A 5x5

        int[][] A = {
                {10, 4, 4 , 5 , 3 },
                {12, 5, 12, 21, 12},
                {12, 3, 4 , 5 , 5 },
                {2 , 4, 5 , 3 , 2 },
                {2 , 7, 7 , 9 , 0 }

        };

        //Declaração da matriz B 5x5
        int[][] B = {
                {2 , 3 , 4, 5, 7 },
                {14, 8 , 7, 9, 9 },
                {2 , 4 , 8, 9, 12},
                {2 , 12, 4, 7, 9 },
                {22, 12, 8, 7, 5 }
        };

        //Exibindo a Matriz A

        System.out.println("\nMatriz A: \n");

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

        //Declarando as matrizes para armazenarem os resultados das operações

        int[][] soma = new int[5][5];
        int[][] subtracao = new int[5][5];
        double[][] divisao = new double[5][5];

        //Calculando a soma e a subtração no mesmo laço

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                soma[i][j] = A[i][j] + B[i][j];
                subtracao[i][j] = A[i][j] - B[i][j];
            }
        }

        //Calculando a divisão:

        // Percorre as linhas e colunas das matrizes

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                // Verifica se o divisor é diferente de zero
                if (B[i][j] != 0) {

                    // Realiza a divisão elemento por elemento
                    divisao[i][j] = (double) A[i][j] / B[i][j];
                } else {

                    // Informa que não é possível dividir por zero

                    System.out.println("Aviso: divisão por zero na posição [" + i + "][" + j + "]\n");
                    return;
                }
            }

        }
        // Exibindo os resultados:
        //Resultado da soma:

        System.out.println("\nLista01.Soma (A + B):\n");
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(soma[i][j] + "\t");
            }

            System.out.println();
        }

        //Resultado da subtração:

        System.out.println("\nSubtração (A - B):\n");
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.printf("%3d \t", subtracao[i][j]);
            }

            System.out.println();
        }
        //Resultado da divisão:

        System.out.println("\nDivisão (A / B):\n");
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.printf("%.2f \t", divisao[i][j]);
            }

            System.out.println();
        }

    }
}