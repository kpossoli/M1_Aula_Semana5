// Definição da classe ContaBancaria
public class ContaBancaria {
    // Variáveis de instância da classe
    private String numeroConta; // Número da conta bancária
    private String titular; // Titular da conta bancária
    private double saldo; // Saldo da conta bancária

    // Construtor parametrizado da classe ContaBancaria
    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta; // Inicializa o número da conta com o valor fornecido
        this.titular = titular; // Inicializa o titular com o valor fornecido
        this.saldo = saldo; // Inicializa o saldo com o valor fornecido
    }

    // Métodos getters e setters para encapsulamento
    public String getNumeroConta() {
        return numeroConta; // Retorna o número da conta
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta; // Define o número da conta
    }

    public String getTitular() {
        return titular; // Retorna o titular da conta
    }

    public void setTitular(String titular) {
        this.titular = titular; // Define o titular da conta
    }

    public double getSaldo() {
        return saldo; // Retorna o saldo da conta
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo; // Define o saldo da conta
    }
}