/*
Classe derivada Cachorro:
Definição da classe Cachorro, que herda da classe Animal e adiciona o método latir().
*/

// Declaração da classe Cachorro no pacote Aula4.Heranca
package Aula3.Heranca.Animal;

// Definição da classe Cachorro, que herda da classe Animal
public class Cachorro extends Animal {
    // Construtor da classe Cachorro
    public Cachorro(String nome, int idade) {
        super(nome, idade); // Chama o construtor da classe base Animal
    }

    // Método latir específico para a classe Cachorro
    public void latir() {
        System.out.println(nome + " está latindo!"); // Exibe uma mensagem indicando que o cachorro está latindo
    }
}
