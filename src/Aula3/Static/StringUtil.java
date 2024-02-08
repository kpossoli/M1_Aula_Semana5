/*
Classe Utilitária com Métodos Estáticos:
Crie uma classe utilitária chamada StringUtil com métodos estáticos para inverter uma string,
contar o número de caracteres e verificar se uma string é um palíndromo.
 */

package Aula3.Static;

// Definição da classe StringUtil
public class StringUtil {
    // Método estático para inverter uma string
    public static String inverterString(String texto) {
        return new StringBuilder(texto).reverse().toString(); // Inverte a string e a retorna
    }

    // Método estático para contar o número de caracteres de uma string
    public static int contarCaracteres(String texto) {
        return texto.length(); // Retorna o comprimento da string
    }

    // Método estático para verificar se uma string é um palíndromo
    public static boolean isPalindromo(String texto) {
        String textoInvertido = inverterString(texto); // Obtém a string invertida
        return texto.equalsIgnoreCase(textoInvertido); // Verifica se as strings são iguais (ignorando maiúsculas e minúsculas)
    }

    // Método main para teste da classe
    public static void main(String[] args) {
        // String de teste
        String palavra = "radar";

        // Exibe a string invertida
        System.out.println("Invertida: " + StringUtil.inverterString(palavra));
        // Exibe o número de caracteres da string
        System.out.println("Número de caracteres: " + StringUtil.contarCaracteres(palavra));
        // Verifica se a string é um palíndromo e exibe o resultado
        System.out.println("É palíndromo? " + StringUtil.isPalindromo(palavra));
    }
}
