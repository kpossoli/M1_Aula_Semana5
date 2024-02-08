package Aula2.JogadorTime;

// Definição da classe Time
public class Time {
    // Atributo da classe
    private Jogador[] jogadores; // Array para armazenar os jogadores do time

    // Construtor da classe Time
    public Time() {
        this.jogadores = new Jogador[11]; // Inicializa o array de jogadores com tamanho para 11 jogadores
    }

    // Método para adicionar um jogador ao time em um determinado índice
    public void adicionarJogador(int indice, Jogador jogador) {
        jogadores[indice] = jogador; // Adiciona o jogador ao array na posição especificada pelo índice
    }

    // Método para obter um jogador do time a partir de um índice
    public Jogador getJogador(int indice) {
        return jogadores[indice]; // Retorna o jogador armazenado no array na posição especificada pelo índice
    }
}

