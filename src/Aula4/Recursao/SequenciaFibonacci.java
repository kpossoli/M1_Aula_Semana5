/*
Sequência Fibonacci:
Crie uma função recursiva para gerar os primeiros N termos da sequência de Fibonacci.
 */

package Aula4.Recursao;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    // Método recursivo para calcular o termo N da sequência de Fibonacci
    public static int calcularFibonacci(int n) {
        if (n == 0) { // Verifica se o número é 0 (caso base)
            return 0; // Retorna 0 para o primeiro termo
        } else if (n == 1) { // Verifica se o número é 1 (caso base)
            return 1; // Retorna 1 para o segundo termo
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2); // Chamada recursiva para calcular o termo
        }
    }
}

