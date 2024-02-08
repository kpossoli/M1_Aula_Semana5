/*
Sobrescrita do Método clone:
Defina uma classe Pessoa e implemente a interface Cloneable. Sobrescreva o método clone()
para criar uma cópia profunda do objeto pessoa.
*/

// Declaração da classe PessoaC no pacote Aula3.Sobrescrita
package Aula3.Sobrescrita;

// Definição da classe PessoaC implementando a interface Cloneable
public class PessoaC implements Cloneable {
    // Variáveis de instância da classe
    private String nome; // Nome da pessoa
    private int idade; // Idade da pessoa

    // Construtor parametrizado da classe PessoaC
    public PessoaC(String nome, int idade) {
        this.nome = nome; // Inicializa o nome da pessoa com o valor fornecido
        this.idade = idade; // Inicializa a idade da pessoa com o valor fornecido
    }

    // Sobrescrita do método clone para criar uma cópia profunda do objeto pessoa
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Chama a implementação padrão do método clone
    }

    // Método main para teste da sobrescrita do método clone
    public static void main(String[] args) {
        // Criação de um objeto PessoaC com nome "João" e idade 30
        PessoaC pessoa1 = new PessoaC("João", 30);
        try {
            // Clonagem do objeto pessoa1
            PessoaC pessoa2 = (PessoaC) pessoa1.clone();
            // Exibição dos dados da pessoa original e da pessoa clonada
            System.out.println("Pessoa original: " + pessoa1.nome + ", " + pessoa1.idade);
            System.out.println("Pessoa clonada: " + pessoa2.nome + ", " + pessoa2.idade);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(); // Exibe informações sobre a exceção de clonagem não suportada
        }
    }
}
