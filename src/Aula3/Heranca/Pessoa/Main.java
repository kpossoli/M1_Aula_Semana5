/*
Herança e Construtores:
Defina uma classe Pessoa com atributos como nome e idade. Derive uma subclasse Estudante
com um atributo adicional para a nota. Implemente construtores nas duas classes, garantindo
que o construtor da subclasse chame o construtor da superclasse.
 */

package Aula3.Heranca.Pessoa;

// Classe principal Main para teste das classes
public class Main {
    // Método main para teste
    public static void main(String[] args) {
        // Criando um estudante
        Estudante estudante = new Estudante("Maria", 20, 8.5);

        // Exibindo os dados do estudante
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Nota: " + estudante.nota);
    }
}
