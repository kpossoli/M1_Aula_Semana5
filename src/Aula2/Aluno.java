/*Construtor de Cópia: Crie uma classe Aluno com atributos como nome, idade e nota.
Implemente um construtor de cópia que recebe outro objeto Aluno como parâmetro e cria
uma cópia dele.*/


package Aula2;

// Definição da classe Aluno
public class Aluno {
    // Variáveis de instância da classe
    String nome; // Nome do aluno
    int idade; // Idade do aluno
    double nota; // Nota do aluno

    // Construtor parametrizado da classe Aluno
    public Aluno(String nome, int idade, double nota) {
        this.nome = nome; // Inicializa o nome com o valor fornecido
        this.idade = idade; // Inicializa a idade com o valor fornecido
        this.nota = nota; // Inicializa a nota com o valor fornecido
    }

    // Construtor de cópia da classe Aluno
    public Aluno(Aluno outroAluno) {
        this.nome = outroAluno.nome; // Copia o nome do outro aluno
        this.idade = outroAluno.idade; // Copia a idade do outro aluno
        this.nota = outroAluno.nota; // Copia a nota do outro aluno
    }
}