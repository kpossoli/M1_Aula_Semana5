/*
Variável Estática:
Defina uma classe Contador com uma variável estática que conta o número de instâncias da
classe. Crie um método estático para acessar e exibir o valor atual da variável estática.
 */

package Aula3.Static;

// Definição da classe Contador
public class Contador {
    // Variável estática que conta o número de instâncias da classe
    private static int numeroDeInstancias = 0;

    // Construtor da classe Contador, incrementa o número de instâncias
    public Contador() {
        numeroDeInstancias++; // Incrementa o número de instâncias toda vez que um objeto é criado
    }

    // Método estático para acessar e exibir o valor atual da variável estática
    public static int getNumeroDeInstancias() {
        return numeroDeInstancias; // Retorna o número de instâncias da classe
    }

    // Método main para teste da variável estática e do método estático
    public static void main(String[] args) {
        // Cria três instâncias da classe Contador
        new Contador();
        new Contador();
        new Contador();

        // Exibe o número de instâncias da classe
        System.out.println("Número de instâncias: " + Contador.getNumeroDeInstancias());
    }
}