/*
Subclasse Estudante:
Definição da subclasse Estudante, que herda da classe Pessoa e adiciona o atributo nota.
Implementação de construtores na subclasse, garantindo a chamada do construtor da superclasse.
*/

// Declaração da subclasse Estudante no pacote Aula4.HerancaConstrutores
package Aula3.Heranca.Pessoa;

// Definição da subclasse Estudante, que herda da classe Pessoa
public class Estudante extends Pessoa {
    // Atributo adicional para nota do estudante
    protected double nota;

    // Construtor da subclasse Estudante
    public Estudante(String nome, int idade, double nota) {
        super(nome, idade); // Chama o construtor da superclasse Pessoa
        this.nota = nota;   // Inicializa a nota do estudante
    }
}