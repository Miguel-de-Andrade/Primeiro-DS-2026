public class MultiplicacaoMatrizes {
    public static void main(String[] args) {

        //Declara a matriz A 2x4

        int [] [] A = {
                {2, 6, 1, 8},
                {3, 5, 4, 1}
        };

        //Declara a matriz B 4x2

        int [][] B = {
                {3, 6},
                {1, 7},
                {9, 8},
                {1, 3}
        };

        //Declara a matriz C que vai armazenar o resultado da multiplicação A x B

        int [][] C = new int[2][2];

        //Realizando a multiplicação entre as matrizes A e B
        //Multiplicando linha por coluna

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 4; k++) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        //Exibindo a Matriz A

        System.out.println("\nA matriz A:\n");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(A [i][j] + "\t");
            }
            System.out.println();
        }

        //Exibindo a matriz B

        System.out.println("\nMatriz B:\n");

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        //Exibindo a matriz C (Resultado da multiplicação)

        System.out.println("\nMatriz resultante de A*B:\n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
