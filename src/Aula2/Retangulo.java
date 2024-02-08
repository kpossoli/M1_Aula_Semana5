/*Sobrecarga de Construtores: Defina uma classe Retangulo com atributos de comprimento
e largura. Implemente vários construtores com diferentes combinações de parâmetros. Por
exemplo, um construtor apenas com comprimento, outro com comprimento e largura, e
outro sem parâmetros.*/


package Aula2;

// Definição da classe Retangulo
public class Retangulo {
    // Variáveis de instância da classe
    double comprimento; // Comprimento do retângulo
    double largura; // Largura do retângulo

    // Construtor com comprimento e largura
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento; // Inicializa o comprimento com o valor fornecido
        this.largura = largura; // Inicializa a largura com o valor fornecido
    }

    // Construtor apenas com comprimento
    public Retangulo(double comprimento) {
        this.comprimento = comprimento; // Inicializa o comprimento com o valor fornecido
        this.largura = 0; // Valor padrão para largura
    }

    // Construtor padrão sem parâmetros
    public Retangulo() {
        this.comprimento = 0; // Valor padrão para comprimento
        this.largura = 0; // Valor padrão para largura
    }
}