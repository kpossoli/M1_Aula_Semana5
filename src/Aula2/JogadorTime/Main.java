/*
Crie a classe Jogador descrita no “diagrama” abaixo:
a) Cadastrar/Instanciar pelo menos um time completo 11 jogadores.
b) Criar um método que verifica a condição de jogo, ou seja, um método
booleano que retornará true se o jogador está apto a jogar e false se o jogador
está suspenso. Note que um jogador está suspenso pelo 3 cartão amarelo ou
quando recebe uma punição cartão vermelho ou em uma decisão do tribunal.
c) Em uma outra classe, crie o método main, o qual cadastra os jogadores e
ao final imprimirá a lista do “plantel” juntamente com a informação de quem
está apto a jogar, conforme a figura abaixo
 */


package Aula2.JogadorTime;

import java.util.Date;

// Classe principal Main
public class Main {
    // Método main, ponto de entrada do programa
    public static void main(String[] args) {
        Time time = new Time(); // Cria um novo objeto da classe Time

        // Cadastrando os jogadores
        time.adicionarJogador(0, new Jogador(1, "Marcelo Grohe", "Muralha Tricolor", new Date(1987, 0, 13), 1, "Goleiro", 10, 0, true));

        // Imprimindo o plantel
        System.out.println("JOGADORES CADASTRADOS\n");
        for (int i = 0; i < 11; i++) { // Loop para iterar sobre os jogadores do time
            Jogador jogador = time.getJogador(i); // Obtém o jogador na posição atual do loop
            System.out.println(jogador); // Imprime o jogador, agora a posição será mostrada
        }
    }
}

