import javax.swing.*;

public class Matriz5x5_Opcoes {
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

        //Declarando a matriz C para armazenar o resultado das operações

        double[][] C = new double[5][5];

        int opc = Integer.parseInt((JOptionPane.showInputDialog("Escolha uma opção:\n1 - Lista01.Soma\n2 - Subtração\n3 - Divisão")));


        //Calculando a soma

        if (opc == 1) {

            for (int i = 0; i < 5; i++) {

                for (int j = 0; j < 5; j++) {

                    C[i][j] = A[i][j] + B[i][j];
                }
            }

            //exibindo o resultado da soma
            System.out.println("\nResultado da soma: \n");

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%3.0f \t",C[i][j]);
                }

                System.out.println();
            }

        } else if (opc == 2) {

            //calculando a subtração

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    C [i][j] = A[i][j] - B[i][j];
                }
            }

            //Exibindo a subtração

            System.out.println("\n Subtração (A - B):\n");

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%3.0f \t", C[i][j]);
                }

                System.out.println();

            }

        } else if (opc == 3) {

            // Calculando a divisão:

            // Percorre as linhas e colunas das matrizes
            for (int i = 0; i < 5; i++) {

                for (int j = 0; j < 5; j++) {

                    // Verifica se o divisor é diferente de zero
                    if (B[i][j] != 0) {

                        // Realiza a divisão elemento por elemento
                        C [i][j] = (double) A[i][j] / B[i][j];

                    } else {

                        // Informa que não é possível dividir por zero
                        System.out.println("Aviso: divisão por zero na posição [" + i + "][" + j + "]\n");

                        return;
                    }
                }

            }

            //Exibindo a divisão:

            System.out.println("\n Divisão (A / B):\n");

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%3.2f \t", C[i][j]);
                }

                System.out.println();
            }

        } else {
            JOptionPane.showMessageDialog(null,"Opção inválida");
        }
    }
}
