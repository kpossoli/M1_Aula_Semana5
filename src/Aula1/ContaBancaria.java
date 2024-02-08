/*Faça um programa que simule o funcionamento de uma conta bancária.
As definições da classe conta são:

atributos : número da conta, nome do correntista e saldo da conta.
métodos : depositar, sacar e imprimir saldo.*/

package Aula1;

// Definição da classe ContaBancaria
public class ContaBancaria {
    // Atributos da classe
    private int numeroConta; // Número da conta bancária
    private String nomeCorrentista; // Nome do correntista da conta bancária
    private double saldo; // Saldo da conta bancária

    // Construtor da classe ContaBancaria
    public ContaBancaria(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta; // Inicializa o número da conta
        this.nomeCorrentista = nomeCorrentista; // Inicializa o nome do correntista
        this.saldo = saldo; // Inicializa o saldo da conta
    }

    // Método para realizar um depósito na conta
    public void depositar(double valor) {
        saldo += valor; // Incrementa o saldo com o valor do depósito
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo); // Exibe uma mensagem indicando o sucesso do depósito e o novo saldo
    }

    // Método para realizar um saque na conta
    public void sacar(double valor) {
        if (valor <= saldo) { // Verifica se há saldo suficiente para o saque
            saldo -= valor; // Decrementa o saldo com o valor do saque
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo); // Exibe uma mensagem indicando o sucesso do saque e o novo saldo
        } else {
            System.out.println("Saldo insuficiente para o saque."); // Exibe uma mensagem de erro indicando saldo insuficiente
        }
    }

    // Método para imprimir o saldo da conta
    public void imprimirSaldo() {
        System.out.println("Saldo da conta de " + nomeCorrentista + ": R$" + saldo); // Exibe o saldo da conta e o nome do correntista
    }

    // Método main, ponto de entrada do programa
    public static void main(String[] args) {
        // Criação de um objeto da classe ContaBancaria com os valores especificados
        ContaBancaria minhaConta = new ContaBancaria(12345, "Fulano", 1000.0);

        // Chamada dos métodos do objeto criado
        minhaConta.imprimirSaldo(); // Imprime o saldo inicial da conta
        minhaConta.depositar(500.0); // Realiza um depósito na conta
        minhaConta.sacar(200.0); // Realiza um saque na conta
        minhaConta.imprimirSaldo(); // Imprime o saldo atualizado da conta
        //minhaConta.sacar(1500); // Tenta realizar um saque com valor superior ao saldo disponível (comentado para evitar erro)
        //minhaConta.imprimirSaldo(); // Imprime novamente o saldo da conta (comentado para evitar erro)
    }
}

