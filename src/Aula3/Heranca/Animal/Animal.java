/*
Classe base Animal:
Definição da classe Animal com atributos comuns a todos os animais, como nome e idade.
*/

// Declaração da classe Animal no pacote Aula4.Heranca
package Aula3.Heranca.Animal;

// Definição da classe Animal
public class Animal {
    // Atributos da classe Animal
    protected String nome; // Nome do animal
    protected int idade;   // Idade do animal

    // Construtor da classe Animal
    public Animal(String nome, int idade) {
        this.nome = nome;   // Inicializa o nome do animal
        this.idade = idade; // Inicializa a idade do animal
    }
}
