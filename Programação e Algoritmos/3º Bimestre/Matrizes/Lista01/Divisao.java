public class Divisao {
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

        double [][] C = new double [2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                // Verifica se o divisor é diferente de zero
                if (B[i][j] != 0){

                    // Realiza a divisão elemento por elemento
                    C [i][j] =  (double)A[i][j]/B[i][j];

                } else{

                    // Informa que não é possível dividir por zero
                    System.out.println("Erro: divisão por zero na posição [" + i + "][" + j + "]");

                    return;
                }
            }

        }

        // Exibe a matriz A

        System.out.println("Matriz A");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + "\t");
            }

            System.out.println();
        }

        // Exibe a matriz B

        System.out.println("Matriz B");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + "\t");
            }

            System.out.println();
        }

        // Exibe a matriz C, resultado da divisão

        System.out.println("\nMatriz C = A / B:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
