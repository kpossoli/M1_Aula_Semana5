/* Sobrescrita dos Métodos equals e hashCode:
Projete uma classe Livro com atributos como título, autor e ISBN. Sobrescreva os métodos
equals() e hashCode() para garantir comparação e geração adequada de códigos hash ao usar
instâncias da classe. */

// Declaração da classe Livro no pacote Aula3.Sobrescrita
package Aula3.Sobrescrita;

// Importação da classe Objects para uso no método equals
import java.util.Objects;

// Definição da classe Livro
public class Livro {
    // Variáveis de instância da classe
    private String titulo; // Título do livro
    private String autor; // Autor do livro
    private String isbn; // ISBN (International Standard Book Number) do livro

    // Construtor parametrizado da classe Livro
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo; // Inicializa o título do livro com o valor fornecido
        this.autor = autor; // Inicializa o autor do livro com o valor fornecido
        this.isbn = isbn; // Inicializa o ISBN do livro com o valor fornecido
    }

    // Sobrescrita do método equals para comparar Livros
    @Override
    public boolean equals(Object o) {
        // Verifica se o objeto sendo comparado é o próprio livro
        if (this == o) return true;
        // Verifica se o objeto sendo comparado é nulo ou de uma classe diferente
        if (o == null || getClass() != o.getClass()) return false;
        // Converte o objeto para a classe Livro
        Livro livro = (Livro) o;
        // Compara os atributos título, autor e ISBN dos livros usando Objects.equals
        return Objects.equals(titulo, livro.titulo) &&
                Objects.equals(autor, livro.autor) &&
                Objects.equals(isbn, livro.isbn);
    }

    // Sobrescrita do método hashCode para gerar o código hash do livro
    @Override
    public int hashCode() {
        // Gera o código hash usando os atributos título, autor e ISBN do livro
        return Objects.hash(titulo, autor, isbn);
    }

    // Método main para teste da sobrescrita dos métodos equals e hashCode
    public static void main(String[] args) {
        // Criação de dois objetos Livro com os mesmos atributos
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", "9780140449099");
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", "9780140449099");

        // Teste de igualdade usando o método equals e exibição do resultado
        System.out.println("livro1.equals(livro2): " + livro1.equals(livro2));
        // Exibição do código hash de cada livro
        System.out.println("livro1.hashCode(): " + livro1.hashCode());
        System.out.println("livro2.hashCode(): " + livro2.hashCode());
    }
}
