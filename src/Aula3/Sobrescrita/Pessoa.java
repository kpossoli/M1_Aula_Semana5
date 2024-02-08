/* Sobrescrita do Método toString:
Crie uma classe Pessoa com atributos como nome e idade. Sobrescreva o método toString() para
exibir uma representação personalizada em forma de string da pessoa. */

// Declaração da classe Pessoa no pacote Aula3.Sobrescrita
package Aula3.Sobrescrita;

// Definição da classe Pessoa
public class Pessoa {
    // Variáveis de instância da classe
    private String nome; // Nome da pessoa
    private int idade; // Idade da pessoa

    // Construtor parametrizado da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome; // Inicializa o nome da pessoa com o valor fornecido
        this.idade = idade; // Inicializa a idade da pessoa com o valor fornecido
    }

    // Sobrescrita do método toString para exibir uma representação personalizada da pessoa
    @Override
    public String toString() {
        // Retorna uma string formatada com o nome e a idade da pessoa
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    // Método main para teste da sobrescrita do método toString
    public static void main(String[] args) {
        // Criação de um objeto Pessoa com nome "João" e idade 30
        Pessoa pessoa = new Pessoa("João", 30);
        // Exibe a representação personalizada da pessoa
        System.out.println(pessoa);
    }
}
