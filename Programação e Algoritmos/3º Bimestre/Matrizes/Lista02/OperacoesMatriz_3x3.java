public class OperacoesMatriz_3x3 {
    public static void main(String[] args) {

        //Declarando a Matriz A 3x3

        int [][] A = {
                {3, 1, 6},
                {3, 6, 7},
                {4, 3, 1}
        };

        //Declarando a matriz B 3x3

        int [][] B = {
                {1, 5, 4},
                {2, 1, 6},
                {9, 1, 3}
        };

        //Exibindo a mtriz A

        System.out.println("\nMatriz A:\n");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();

        }

        //Exibindo a mtriz B

        System.out.println("\nMatriz B\n");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] + "\t");
            }

            System.out.println();

        }

        //declarando as variáveis para armazenarem os resultados

        int [][] soma = new int[3][3];
        int [][] subtracao = new int[3][3];
        double [][] divisao = new double[3][3];

        //Calculando a soma e a subtração no mesmo laço

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                soma[i][j] = A[i][j] + B[i][j];
                subtracao[i][j] = A[i][j] - B[i][j];
            }
        }

        //Calculando a divisão

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                //Verifica se o divisor é diferente de 0
                if (B[i][j] != 0){

                    //Realiza a divisão elemento por elemento
                    divisao[i][j] = (double)A[i][j] / B[i][j];

                }else {

                    //Informa que não é possível dividir por zero
                    System.out.println("Erro: divisão por zero na linha " +i+ ", coluna " +j );

                    return;
                }

            }

        }

        //Exibindo os resultados

        //Exibindo a soma

        System.out.println("\nResultado da soma entre a matriz A e B:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(soma[i][j] + "\t");
            }

            System.out.println();
        }

        //Exibindo a subtração

        System.out.println("\nResultado da subtração entre a matriz A e B:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.printf("%2d \t", subtracao[i][j]);
            }

            System.out.println();
        }

        //Exibindo a divisão

        System.out.println("\nResultado da divisão entre a matriz A e B:\n");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.printf("%.2f \t", divisao[i][j]);
            }

            System.out.println();
        }

    }
}
