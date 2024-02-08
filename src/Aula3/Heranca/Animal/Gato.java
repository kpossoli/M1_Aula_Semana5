/*
Classe derivada Gato:
Definição da classe Gato, que herda da classe Animal e adiciona o método miar().
*/

// Declaração da classe Gato no pacote Aula4.Heranca
package Aula3.Heranca.Animal;

// Definição da classe Gato, que herda da classe Animal
public class Gato extends Animal {
    // Construtor da classe Gato
    public Gato(String nome, int idade) {
        super(nome, idade); // Chama o construtor da classe base Animal
    }

    // Método miar específico para a classe Gato
    public void miar() {
        System.out.println(nome + " está miando!"); // Exibe uma mensagem indicando que o gato está miando
    }
}
