/*Utilizando a base do exercício anterior (conta bancária). Faça um programa que simule o funcionamento de uma conta bancária, porém agora será necessário um novo método (imprimir extrato).
As definições da classe conta são:

atributos : número da conta, nome do correntista, saldo da conta, movimentações.
métodos : depositar, sacar, imprimir saldo, imprimir extrato.

Lembre-se, neste exercício precisaremos instanciar o objeto conta, atribuir seus valores utilizando os métodos de acesso (getters e setters). Para imprimir um extrato será necessário registrar então as movimentações realizadas (utilize uma coleção). */

package Aula1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Definição da classe ContaBancaria1
public class ContaBancaria1 {
    // Atributos da classe
    private int numeroConta; // Número da conta bancária
    private String nomeCorrentista; // Nome do correntista da conta bancária
    private double saldo; // Saldo da conta bancária
    private List<String> movimentacoes; // Lista para armazenar as movimentações da conta

    // Construtor da classe ContaBancaria1
    public ContaBancaria1(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta; // Inicializa o número da conta
        this.nomeCorrentista = nomeCorrentista; // Inicializa o nome do correntista
        this.saldo = saldo; // Inicializa o saldo da conta
        this.movimentacoes = new ArrayList<>(); // Inicializa a lista de movimentações
    }

    // Método para realizar um depósito na conta
    public void depositar(double valor) {
        saldo += valor; // Incrementa o saldo com o valor do depósito
        registrarMovimentacao("Depósito", valor); // Registra a movimentação de depósito
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo); // Exibe uma mensagem indicando o sucesso do depósito e o novo saldo
    }

    // Método para realizar um saque na conta
    public void sacar(double valor) {
        if (valor <= saldo) { // Verifica se há saldo suficiente para o saque
            saldo -= valor; // Decrementa o saldo com o valor do saque
            registrarMovimentacao("Saque", valor); // Registra a movimentação de saque
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo); // Exibe uma mensagem indicando o sucesso do saque e o novo saldo
        } else {
            System.out.println("Saldo insuficiente para o saque."); // Exibe uma mensagem de erro indicando saldo insuficiente
        }
    }

    // Método para imprimir o saldo da conta
    public void imprimirSaldo() {
        System.out.println("Saldo da conta de " + nomeCorrentista + ": R$" + saldo); // Exibe o saldo da conta e o nome do correntista
    }

    // Método para imprimir o extrato da conta
    public void imprimirExtrato() {
        System.out.println("Extrato da conta de " + nomeCorrentista + ":"); // Exibe uma mensagem indicando o início do extrato
        for (String movimentacao : movimentacoes) { // Itera sobre as movimentações na lista
            System.out.println(movimentacao); // Exibe cada movimentação
        }
        System.out.println("Saldo final: R$" + saldo); // Exibe o saldo final da conta
    }

    // Método privado para registrar uma movimentação na conta
    private void registrarMovimentacao(String tipo, double valor) {
        String movimentacao = new Date() + " - " + tipo + " de R$" + valor; // Cria uma string com a data, tipo e valor da movimentação
        movimentacoes.add(movimentacao); // Adiciona a movimentação à lista de movimentações
    }

    // Método main, ponto de entrada do programa
    public static void main(String[] args) {
        // Criação de um objeto da classe ContaBancaria1 com os valores especificados
        ContaBancaria1 minhaConta = new ContaBancaria1(12345, "Fulano", 1000.0);

        // Chamada dos métodos do objeto criado
        minhaConta.depositar(500.0); // Realiza um depósito na conta
        minhaConta.sacar(200.0); // Realiza um saque na conta
        minhaConta.imprimirExtrato(); // Imprime o extrato da conta
    }
}
