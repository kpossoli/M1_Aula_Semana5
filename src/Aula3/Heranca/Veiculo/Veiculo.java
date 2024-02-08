/*
Polimorfismo com Herança:
Crie uma classe base Veiculo com um método mover(). Derive duas classes Carro e Moto dessa
classe. Sobrescreva o método mover() em cada classe derivada para exibir uma mensagem
diferente indicando como cada veículo se move.
 */

package Aula3.Heranca.Veiculo;

// Definição da classe base Veiculo
public class Veiculo {
    // Método mover genérico
    public void mover() {
        System.out.println("Veículo movendo-se de forma genérica.");
    }
}
