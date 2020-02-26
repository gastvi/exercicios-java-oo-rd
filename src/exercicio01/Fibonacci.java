package exercicio01;

public class Fibonacci {

    /**
     * Retorna um array contendo uma sequencia de números inteiros de Fibonacci.
     * <p>
     * A sequencia de Fibonacci é aquela em que o valor do próximo número é igual a soma dos dois números
     * anteriores, começando por 1 e 2.
     * <p>
     * Ex.:
     * Uma sequência Fibonacci de tamanho 10:
     * <p>
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
     *
     * @param tamanho Tamanho da sequencia de números de Fibonacci a ser retornada.
     * @return int[]
     */
    public int[] getSequenciaFibonacciDe(int tamanho) {

        if (tamanho < 2) {

        } else {
            for (int x = 0; x < tamanho; x++) {
                int temp;
                int resultado;
                int resultado2;
                resultado = tamanho - 1;
                resultado2 = tamanho - 2;
                temp = resultado + resultado2;

            }

        }

        return new int[0];
    }
}
