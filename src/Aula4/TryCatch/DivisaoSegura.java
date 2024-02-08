/*
Divisão Segura:
Crie um programa que solicita dois números do usuário e realiza a divisão. Utilize um bloco
try/catch para lidar com a possível exceção de divisão por zero.
 */

package Aula4.TryCatch;

import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita ao usuário os números para realizar a divisão
            System.out.print("Digite o dividendo: ");
            int dividendo = scanner.nextInt();
            System.out.print("Digite o divisor: ");
            int divisor = scanner.nextInt();

            // Realiza a divisão e exibe o resultado
            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            // Captura a exceção caso ocorra uma divisão por zero
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (Exception e) {
            // Captura outras exceções não previstas
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fecha o scanner para evitar vazamento de recursos
            scanner.close();
        }
    }

    // Método para realizar a divisão segura
    public static double dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}

