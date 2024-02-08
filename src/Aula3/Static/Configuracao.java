/*
Bloco Estático:
Projete uma classe Configuracao com uma variável de configuração estática e um bloco estático
que inicializa essa variável. Exiba a configuração em um método estático.
 */

package Aula3.Static;

// Definição da classe Configuracao
public class Configuracao {
    // Variável de configuração estática
    private static String configuracao;

    // Bloco estático para inicialização da variável de configuração
    static {
        configuracao = "Configuração padrão"; // Inicialização da configuração padrão
    }

    // Método estático para exibir a configuração
    public static void exibirConfiguracao() {
        System.out.println("Configuração: " + configuracao); // Exibe a configuração
    }

    // Método main para teste da classe
    public static void main(String[] args) {
        Configuracao.exibirConfiguracao(); // Chama o método para exibir a configuração
    }
}



