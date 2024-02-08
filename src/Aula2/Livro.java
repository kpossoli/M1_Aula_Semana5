/*Múltiplos Construtores: Projete uma classe Livro com atributos como título, autor e
páginas. Implemente múltiplos construtores, incluindo um com todos os parâmetros e
outro apenas com título e autor.*/

package Aula2;

// Definição da classe Livro
public class Livro {
    // Variáveis de instância da classe
    String titulo; // Título do livro
    String autor; // Autor do livro
    int paginas; // Número de páginas do livro

    // Construtor com todos os parâmetros
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo; // Inicializa o título com o valor fornecido
        this.autor = autor; // Inicializa o autor com o valor fornecido
        this.paginas = paginas; // Inicializa o número de páginas com o valor fornecido
    }

    // Construtor apenas com título e autor
    public Livro(String titulo, String autor) {
        this.titulo = titulo; // Inicializa o título com o valor fornecido
        this.autor = autor; // Inicializa o autor com o valor fornecido
        this.paginas = 0; // Valor padrão para páginas
    }
}