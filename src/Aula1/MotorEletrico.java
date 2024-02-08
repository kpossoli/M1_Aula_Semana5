/*Faça um programa que disponibiliza uma interface controladora de um motor elétrico.
As definições da classe motor são:

atributos : temperatura, velocidade, tensão aplicada.
métodos : alterar a velocidade, ler a temperatura. */

package Aula1;

// Definição da classe MotorEletrico
public class MotorEletrico {
    // Atributos da classe
    private double temperatura; // Temperatura do motor em graus Celsius
    private int velocidade; // Velocidade do motor em percentagem
    private double tensao; // Tensão do motor em volts

    // Construtor da classe MotorEletrico
    public MotorEletrico(double temperatura, int velocidade, double tensao) {
        this.temperatura = temperatura; // Inicializa a temperatura do motor
        this.velocidade = velocidade; // Inicializa a velocidade do motor
        this.tensao = tensao; // Inicializa a tensão do motor
    }

    // Método para alterar a velocidade do motor
    public void alterarVelocidade(int novaVelocidade) {
        if (novaVelocidade >= 0 && novaVelocidade <= 100) { // Verifica se a nova velocidade está dentro do intervalo permitido
            velocidade = novaVelocidade; // Atualiza a velocidade do motor
            System.out.println("Velocidade alterada para " + novaVelocidade + "%"); // Exibe uma mensagem indicando a alteração da velocidade
        } else {
            System.out.println("Velocidade inválida. Deve estar entre 0 e 100%."); // Exibe uma mensagem de erro caso a velocidade seja inválida
        }
    }

    // Método para ler a temperatura atual do motor
    public void lerTemperatura() {
        System.out.println("Temperatura atual: " + temperatura + "°C"); // Exibe a temperatura atual do motor
    }

    // Método main, ponto de entrada do programa
    public static void main(String[] args) {
        // Criação de um objeto da classe MotorEletrico com os valores especificados
        MotorEletrico motor = new MotorEletrico(25, 0, 0);

        // Chamada dos métodos do objeto criado
        motor.alterarVelocidade(50); // Altera a velocidade do motor para 50%
        motor.lerTemperatura(); // Lê e exibe a temperatura atual do motor
    }
}
