/* Construtor Básico: Crie uma classe chamada Carro com variáveis de instância para marca,
modelo e ano. Implemente um construtor parametrizado para inicializar essas variáveis
quando um objeto é criado. */

// Declaração da classe Carro no pacote Aula2
package Aula2;

// Definição da classe Carro
public class Carro {
    // Variáveis de instância da classe
    String marca; // Marca do carro
    String modelo; // Modelo do carro
    int ano; // Ano de fabricação do carro

    // Construtor parametrizado da classe Carro
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca; // Inicializa a marca do carro com o valor fornecido
        this.modelo = modelo; // Inicializa o modelo do carro com o valor fornecido
        this.ano = ano; // Inicializa o ano de fabricação do carro com o valor fornecido
    }
}
