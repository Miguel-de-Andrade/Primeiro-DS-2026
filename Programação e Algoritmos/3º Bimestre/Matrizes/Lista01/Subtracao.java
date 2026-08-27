public class Subtracao {
    public static void main(String[] args) {

        // Declaração da matriz A de ordem 2x2

        int [][] A ={
                {10, 20},
                {30, 40}
        };

        // Declaração da matriz B de ordem 2x2

        int[][] B = {
                {2, 4},
                {5, 8}
        };

        // Declaração da matriz C que armazenará o resultado

        int [][] C = new int [2][2];

        // Exibe a matriz A

        System.out.println("Matriz A");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + "\t");
            }

            System.out.println();
        }

        // Exibe a matriz B

        System.out.println("\nMatriz B");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + "\t");
            }

            System.out.println();
        }

        // Faz a subtração

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C [i][j] = A[i][j] - B [i][j];
            }
        }

        //exibe  matriz C

        System.out.println("\nA subtração entre A e B é:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");

            }

            System.out.println();

        }


    }
}
