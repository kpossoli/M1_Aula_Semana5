/*Construtor Padrão: Desenvolva uma classe Pessoa com variáveis de instância para nome
e idade. Crie construtores padrão e parametrizado. Exiba valores padrão se nenhum
parâmetro for fornecido durante a criação do objeto.*/

package Aula2;

// Definição da classe Pessoa
public class Pessoa {
    // Variáveis de instância da classe
    String nome; // Nome da pessoa
    int idade; // Idade da pessoa

    // Construtor padrão da classe Pessoa
    public Pessoa() {
        this.nome = "Sem nome"; // Define o nome como "Sem nome" por padrão
        this.idade = 0; // Define a idade como 0 por padrão
    }

    // Construtor parametrizado da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome; // Inicializa o nome com o valor fornecido
        this.idade = idade; // Inicializa a idade com o valor fornecido
    }
}