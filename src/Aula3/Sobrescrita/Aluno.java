/* Sobrescrita do Método compareTo:
Desenvolva uma classe Aluno com atributos como nome e nota. Implemente a interface
Comparable<Aluno> e sobrescreva o método compareTo() para comparar alunos com base em
suas notas.
 */

package Aula3.Sobrescrita;

// Implementação da interface Comparable com tipo Aluno
public class Aluno implements Comparable<Aluno> {
    // Variáveis de instância da classe
    private String nome; // Nome do aluno
    private double nota; // Nota do aluno

    // Construtor parametrizado da classe Aluno
    public Aluno(String nome, double nota) {
        this.nome = nome; // Inicializa o nome do aluno com o valor fornecido
        this.nota = nota; // Inicializa a nota do aluno com o valor fornecido
    }

    // Método compareTo para comparar alunos com base em suas notas
    @Override
    public int compareTo(Aluno outroAluno) {
        // Comparação baseada nas notas dos alunos
        if (this.nota < outroAluno.nota) {
            return -1; // Retorna -1 se a nota deste aluno for menor
        } else if (this.nota > outroAluno.nota) {
            return 1; // Retorna 1 se a nota deste aluno for maior
        } else {
            return 0; // Retorna 0 se as notas dos alunos forem iguais
        }
    }

    // Método main para teste da comparação
    public static void main(String[] args) {
        // Criação de dois objetos Aluno para teste
        Aluno aluno1 = new Aluno("João", 8.5);
        Aluno aluno2 = new Aluno("Maria", 7.2);

        // Comparação das notas dos alunos
        int resultado = aluno1.compareTo(aluno2);
        // Exibição do resultado da comparação
        if (resultado < 0) {
            System.out.println(aluno1.nome + " tem uma nota maior do que " + aluno2.nome);
        } else if (resultado > 0) {
            System.out.println(aluno1.nome + " tem uma nota menor do que " + aluno2.nome);
        } else {
            System.out.println(aluno1.nome + " e " + aluno2.nome + " têm a mesma nota");
        }
    }
}