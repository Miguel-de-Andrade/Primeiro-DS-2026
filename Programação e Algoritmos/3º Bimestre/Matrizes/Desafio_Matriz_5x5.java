public class Desafio_Matriz_5x5 {
    public static void main(String[] args) {

        //Declaração da Matriz A

        int[][] A = {
                {10, 4, 4 , 5 , 3 },
                {12, 5, 12, 21, 12},
                {12, 3, 4 , 5 , 5,},
                {2 , 4, 5 , 3 , 2 },
                {2 , 7, 7 , 9 , 0 }


        };

        //Declaração da matriz B

        int[][] B = {
                {2 , 3, 4, 5, 7},
                {14, 8, 7, 8, 9},
                {2, 4, 8, 9, 12},
                {2, 12, 4, 7, 9},
                {22, 12, 8, 7, 5}
        };

        //Exibindo a Matriz A

        System.out.println("Matriz A: \n");

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        //Exibindo a Matriz B

        System.out.println("\nMatriz B: \n");

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        //Declarando as matrizes para armazenarem os resultados

        int[][] soma = new int[A.length][A[0].length];
        int[][] subtracao = new int[A.length][A[0].length];
        int[][] divisao = new int[A.length][A[0].length];

        //Calculando a soma

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                soma[i][j] = A[i][j] + B[i][j];
            }
        }

        //Calculando a subtração

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                subtracao[i][j] = A[i][j] - B[i][j];
            }
        }

        //Calculando a divisão

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                // Verifica se o divisor é diferente de zero
                if (B[i][j] != 0) {

                    // Realiza a divisão elemento por elemento
                    divisao[i][j] = A[i][j] / B[i][j];

                } else {

                    // Informa que não é possível dividir por zero — define como zero e continua
                    System.out.println("Aviso: divisão por zero na posição [" + i + "][" + j + "], definindo 0.");
                    divisao[i][j] = 0;
                }

            }

        }

        // Exibindo os resultados
        System.out.println("\nSoma (A + B):");
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                System.out.print(soma[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSubtração (A - B):");
        for (int i = 0; i < subtracao.length; i++) {
            for (int j = 0; j < subtracao[i].length; j++) {
                System.out.print(subtracao[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nDivisão (A / B):");
        for (int i = 0; i < divisao.length; i++) {
            for (int j = 0; j < divisao[i].length; j++) {
                System.out.print(divisao[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
