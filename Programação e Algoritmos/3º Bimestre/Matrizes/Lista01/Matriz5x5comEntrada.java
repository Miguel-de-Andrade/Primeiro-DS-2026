import javax.swing.*;

public class Matriz5x5comEntrada {
    public static void main(String[] args) {


        // Pergunta ao usuário o número de linhas e colunas da matriz

        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas:"));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));

        //Define o tamnho da matriz

        int[][] A = new int[linhas][colunas];
        int [][] B = new int[linhas][colunas];

        //Preenche a matriz A com valores fornecidos pelo usuário
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a linha " +i+ " e coluna" +j+ " da matriz A: "));
            }
        }

        //Preenche a matriz B com valores fornecidos pelo usuário
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                B[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a linha " +i+ " e coluna " +j+ " da matriz B: "));
            }
        }

        //Exibindo a Matriz A
        System.out.println("\nMatriz A: \n");

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {
                System.out.print(A[i][j] + "\t");
            }

            System.out.println();
        }

        //Exibindo a Matriz B
        System.out.println("\nMatriz B: \n");

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {
                System.out.print(B[i][j] + "\t");
            }

            System.out.println();
        }


        //Declarando as variáveis que vão aramazenar os resultados
        int [][] soma = new int[linhas][colunas];
        int [][] subtracao = new int[linhas][colunas];
        double [][] divisao = new double[linhas][colunas];


        //Calculando a soma e a subtração no mesmo laço

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {

                soma[i][j] = A[i][j] + B[i][j];
                subtracao [i][j] = A[i][j] - B[i][j];
            }
        }

        //Calculando a divisão:

        // Percorre as linhas e colunas das matrizes
        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {

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

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {
                System.out.print(soma[i][j] + "\t");
            }

            System.out.println();
        }


        //Resultado da subtração:

        System.out.println("\nSubtração (A - B):\n");

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {
                System.out.printf("%3d \t", subtracao[i][j]);
            }

            System.out.println();
        }

        //Resultado da divisão:

        System.out.println("\nDivisão (A / B):\n");

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {
                System.out.printf("%.2f \t", divisao[i][j]);
            }

            System.out.println();
        }
    }
}
