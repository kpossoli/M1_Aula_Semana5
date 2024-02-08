package Aula2.JogadorTime;

import java.util.Date;

// Definição da classe Jogador
public class Jogador {
    // Atributos da classe
    private int id; // Identificador do jogador
    private String nome; // Nome completo do jogador
    private String apelido; // Apelido do jogador
    private Date dataNascimento; // Data de nascimento do jogador
    private int numero; // Número da camisa do jogador
    private String posicao; // Posição em que o jogador atua
    private int qualidade; // Qualidade técnica do jogador
    private int cartoes; // Quantidade de cartões recebidos pelo jogador
    private boolean suspenso; // Indica se o jogador está suspenso ou não

    // Construtor vazio da classe Jogador
    public Jogador() {
    }

    // Construtor da classe Jogador com parâmetros
    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade, int cartoes, boolean suspenso) {
        this.id = id; // Inicializa o identificador do jogador
        this.nome = nome; // Inicializa o nome completo do jogador
        this.apelido = apelido; // Inicializa o apelido do jogador
        this.dataNascimento = dataNascimento; // Inicializa a data de nascimento do jogador
        this.numero = numero; // Inicializa o número da camisa do jogador
        this.posicao = posicao; // Inicializa a posição em que o jogador atua
        this.qualidade = qualidade; // Inicializa a qualidade técnica do jogador
        this.cartoes = cartoes; // Inicializa a quantidade de cartões recebidos pelo jogador
        this.suspenso = suspenso; // Inicializa se o jogador está suspenso ou não
    }

    // Método para verificar a condição de jogo do jogador
    public boolean verificarCondicaoDeJogo() {
        if (suspenso || cartoes >= 3) { // Verifica se o jogador está suspenso ou se recebeu 3 ou mais cartões
            return false; // Retorna false indicando que o jogador não está em condições de jogo
        }
        return true; // Retorna true indicando que o jogador está em condições de jogo
    }

    // Método toString para representar o jogador como uma string
    @Override
    /*Esta anotação indica que o método toString() está sobrescrevendo um método da classe pai (nesse caso, da
    classe Object). É uma prática recomendada incluir essa anotação sempre que você estiver substituindo um método
    de uma superclasse para evitar erros de compilação.*/
    public String toString() {
        String condicao;
        if (suspenso) {
            condicao = "SUSPENSO";
        } else {
            condicao = "TÁ PRA JOGO";
        }
        //String condicao = suspenso ? "SUSPENSO" : "TÁ PRA JOGO"; // Define a condição do jogador como suspenso ou apto
        /* Esta linha cria uma variável chamada condicao que armazena a string "SUSPENSO" se o jogador estiver suspenso
        (suspenso for true), caso contrário, armazena "TÁ PRA JOGO". Isso é feito usando o operador ternário (? :),
        que é uma forma condicional de atribuição em Java.*/
        return posicao + ": " + numero + " - " + nome + " (" + apelido + ") - " + dataNascimento + " CONDIÇÃO: " + condicao; // Retorna uma string formatada representando o jogador
    }
}


