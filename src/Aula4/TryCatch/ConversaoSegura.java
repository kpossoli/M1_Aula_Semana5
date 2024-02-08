/*
Implemente um programa que lê uma entrada do usuário como uma string e tenta convertê-la
para um número inteiro. Utilize um bloco try/catch para capturar exceções de formato
inadequado.
 */

package Aula4.TryCatch;

import java.util.Scanner;

public class ConversaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita ao usuário a entrada para converter em número inteiro
            System.out.print("Digite um número inteiro: ");
            String input = scanner.nextLine();

            // Converte a entrada em um número inteiro e exibe
            int numero = Integer.parseInt(input);
            System.out.println("Número digitado: " + numero);
        } catch (NumberFormatException e) {
            // Captura a exceção caso ocorra um formato de número inválido
            System.out.println("Erro: Formato de número inválido.");
        } catch (Exception e) {
            // Captura outras exceções não previstas
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fecha o scanner para evitar vazamento de recursos
            scanner.close();
        }
    }
}

