/*
Método Estático Simples:
Crie uma classe Matematica com um método estático chamado somar que recebe dois números
como parâmetros e retorna a soma.
 */

package Aula3.Static;

// Definição da classe Matematica
public class Matematica {
    // Método estático somar que recebe dois números como parâmetros e retorna a soma
    public static int somar(int num1, int num2) {
        return num1 + num2; // Retorna a soma dos dois números
    }

    // Método main para teste do método estático somar
    public static void main(String[] args) {
        // Chamada do método estático somar da classe Matematica
        int resultado = Matematica.somar(5, 3);
        // Exibição do resultado da soma
        System.out.println("Resultado da soma: " + resultado);
    }
}