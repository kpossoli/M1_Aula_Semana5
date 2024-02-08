/*
Leitura de Arquivo:
Escreva um programa que tenta abrir e ler um arquivo específico. Utilize um bloco try/catch para
lidar com possíveis exceções de arquivo não encontrado ou erro de leitura.
 */

package Aula4.TryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraDeArquivo {
    public static void main(String[] args) {
        try {
            // Abre o arquivo para leitura
            File arquivo = new File("arquivo.txt");
            Scanner scanner = new Scanner(arquivo);

            // Lê o arquivo linha por linha e exibe na tela
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            // Fecha o scanner após a leitura do arquivo
            scanner.close();
        } catch (FileNotFoundException e) {
            // Captura a exceção caso o arquivo não seja encontrado
            System.out.println("Erro: Arquivo não encontrado.");
        } catch (Exception e) {
            // Captura outras exceções não previstas
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
