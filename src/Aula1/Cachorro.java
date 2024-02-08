/*Faça um programa que simule as ações de um cachorro.
As definições da classe Cachorro são:

atributos : nome, peso e cor.
métodos : latir, correr e dar a pata.*/

package Aula1;

// Definição da classe Cachorro
public class Cachorro {
    // Atributos da classe
    private String nome; // Nome do cachorro
    private double peso; // Peso do cachorro
    private String cor; // Cor do pelo do cachorro

    // Construtor da classe Cachorro
    public Cachorro(String nome, double peso, String cor) {
        this.nome = nome; // Inicializa o nome do cachorro
        this.peso = peso; // Inicializa o peso do cachorro
        this.cor = cor; // Inicializa a cor do pelo do cachorro
    }

    // Método para fazer o cachorro latir
    public void latir() {
        System.out.println(nome + " está latindo: Au Au!"); // Exibe uma mensagem indicando que o cachorro está latindo
    }

    // Método para fazer o cachorro correr
    public void correr() {
        System.out.println(nome + " está correndo. Velocidade depende do porte!"); // Exibe uma mensagem indicando que o cachorro está correndo
    }

    // Método para fazer o cachorro dar a pata
    public void darPata() {
        System.out.println(nome + " deu a pata. Muito educado!"); // Exibe uma mensagem indicando que o cachorro deu a pata
    }

    // Método main, ponto de entrada do programa
    public static void main(String[] args) {
        // Criação de um objeto da classe Cachorro com os valores especificados
        Cachorro meuCachorro = new Cachorro("Bolinha", 10.5, "Marrom");

        // Chamada dos métodos do objeto criado
        meuCachorro.latir(); // Faz o cachorro latir
        meuCachorro.correr(); // Faz o cachorro correr
        meuCachorro.darPata(); // Faz o cachorro dar a pata
    }
}
