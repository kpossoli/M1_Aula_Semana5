/*
Fatorial Recursivo:
Escreva um método recursivo para calcular o fatorial de um número.
 */

package Aula4.Recursao;

public class FatorialRecursivo {
    public static void main(String[] args) {
        int numero = 3;
        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    // Método recursivo para calcular o fatorial de um número
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) { // Verifica se o número é 0 ou 1 (casos base)
            return 1; // Retorna 1 para fatorial de 0 e 1
        } else {
            return n * calcularFatorial(n - 1); // Chamada recursiva para calcular o fatorial
        }
    }
}

