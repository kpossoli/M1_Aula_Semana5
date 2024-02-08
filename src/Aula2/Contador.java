/*Escreva uma classe Contador, que encapsule um valor usado para contagem de itens ou eventos.
A classe deve oferecer métodos que devem:

a - Zerar
b - Incrementar
c - Retornar o valor do contador.
q - Encerrar*/

package Aula2;

// Definição da classe Contador
public class Contador {
    // Atributo da classe
    private int valor; // Valor do contador

    // Construtor da classe Contador
    public Contador() {
        this.valor = 0; // Inicializa o valor do contador como zero
    }

    // Método para zerar o contador
    public void zerar() {
        valor = 0; // Define o valor do contador como zero
        System.out.println("Contador zerado."); // Exibe uma mensagem indicando que o contador foi zerado
    }

    // Método para incrementar o contador
    public void incrementar() {
        valor++; // Incrementa o valor do contador
        System.out.println("Contador incrementado para: " + valor); // Exibe uma mensagem indicando o novo valor do contador
    }

    // Método para retornar o valor atual do contador
    public int retornarValor() {
        return valor; // Retorna o valor atual do contador
    }

    // Método main, ponto de entrada do programa
    public static void main(String[] args) {
        // Criação de um objeto da classe Contador
        Contador contador = new Contador();

        // Chamada dos métodos do objeto criado
        contador.incrementar(); // Incrementa o contador
        contador.incrementar(); // Incrementa o contador novamente
        System.out.println("Valor atual do contador: " + contador.retornarValor()); // Exibe o valor atual do contador

        contador.zerar(); // Zera o contador
        System.out.println("Valor atual do contador: " + contador.retornarValor()); // Exibe o valor atual do contador após ser zerado
    }
}


