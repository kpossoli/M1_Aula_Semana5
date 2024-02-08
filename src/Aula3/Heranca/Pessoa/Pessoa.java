/*
Classe Pessoa:
Definição da classe base Pessoa com atributos comuns a todas as pessoas, como nome e idade.
*/

// Declaração da classe Pessoa no pacote Aula4.HerancaConstrutores
package Aula3.Heranca.Pessoa;

// Definição da classe Pessoa
public class Pessoa {
    // Atributos da classe Pessoa
    protected String nome; // Nome da pessoa
    protected int idade;   // Idade da pessoa

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;   // Inicializa o nome da pessoa
        this.idade = idade; // Inicializa a idade da pessoa
    }
}


