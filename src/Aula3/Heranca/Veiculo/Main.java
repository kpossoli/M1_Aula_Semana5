/*
Polimorfismo com Herança:
Crie uma classe base Veiculo com um método mover(). Derive duas classes Carro e Moto dessa
classe. Sobrescreva o método mover() em cada classe derivada para exibir uma mensagem
diferente indicando como cada veículo se move.
 */


package Aula3.Heranca.Veiculo;

// Classe principal para testar o polimorfismo com herança
public class Main {
    public static void main(String[] args) {
        // Instanciando objetos de Carro e Moto
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        // Chamando o método mover() de cada objeto
        carro.mover();
        moto.mover();
    }
}