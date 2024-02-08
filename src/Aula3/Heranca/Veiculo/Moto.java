package Aula3.Heranca.Veiculo;

// Definição da classe Moto, que herda de Veiculo
public class Moto extends Veiculo {
    // Sobrescrita do método mover específico para Moto
    @Override
    public void mover() {
        System.out.println("Moto se deslocando sobre duas rodas.");
    }
}
