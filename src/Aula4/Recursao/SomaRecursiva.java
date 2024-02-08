/*
Soma Recursiva de Números:
Implemente uma função recursiva para calcular a soma dos primeiros N números inteiros.
 */

package Aula4.Recursao;

public class SomaRecursiva {
    public static void main(String[] args) {
        int numero = 3;
        int soma = calcularSoma(numero);
        System.out.println("A soma dos primeiros " + numero + " números é: " + soma);
    }

    // Método recursivo para calcular a soma dos primeiros N números inteiros
    public static int calcularSoma(int n) {
        if (n == 0) { // Verifica se o número é 0 (caso base)
            return 0; // Retorna 0 para a soma de 0 números
        } else {
            return n + calcularSoma(n - 1); // Chamada recursiva para calcular a soma
        }
    }
}

