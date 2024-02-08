package Aula3.Heranca.Veiculo;


// Definição da classe Carro, que herda de Veiculo
public class Carro extends Veiculo {
    // Sobrescrita do método mover específico para Carro
    @Override
    public void mover() {
        System.out.println("Carro se deslocando sobre quatro rodas.");
    }
}