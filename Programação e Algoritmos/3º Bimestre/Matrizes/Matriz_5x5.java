public class Matriz_5x5 {
        public static void main(String[] args) {

            //Declaração da Matriz A de tamanho 5x5

            int[][] A = {
                    {10, 4, 4 , 5 , 3 },
                    {12, 5, 12, 21, 12},
                    {12, 3, 4 , 5 , 5 },
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

            // Única matriz C, utilizada para as três operações
            int[][] C = new int[5][5];

            System.out.println("\nResultados das operações entre as matrizes A e B:");

            //SOMA
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }

            //Exibindo a soma

            System.out.println("\nSoma:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\n--------------------------------------");

            // SUBTRAÇÃO
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    C[i][j] = A[i][j] - B[i][j];
                }
            }

            //Exibindo a subtração

            System.out.println("\nSubtração:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%3d \t", C[i][j]);
                }
                System.out.println();
            }

            System.out.println("\n--------------------------------------");

            // DIVISÃO
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (B[i][j] != 0) {
                        C[i][j] = A[i][j] / B[i][j]; // divisão inteira
                    } else {
                        System.out.println("Aviso: divisão por zero na posição [" + i + "][" + j + "]");
                        C[i][j] = 0;
                    }
                }
            }

            System.out.println("\nDivisão (inteira, pois C é int[][]):");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%3d \t", C[i][j]);
                }
                System.out.println();
            }
        }
    }
