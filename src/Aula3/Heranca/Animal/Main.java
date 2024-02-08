/*
Herança Simples:
Crie uma classe base chamada Animal com atributos como nome e idade. Derive duas classes
Cachorro e Gato dessa classe base. Adicione métodos específicos para cada classe derivada,
como latir() para Cachorro e miar() para Gato.
 */

// Declaração da classe Main no pacote Aula4.Heranca
package Aula3.Heranca.Animal;

// Classe principal Main para teste das classes
public class Main {
    // Método main para teste
    public static void main(String[] args) {
        // Criando um cachorro e um gato
        Cachorro cachorro = new Cachorro("Rex", 5);
        Gato gato = new Gato("Mimi", 3);

        // Chamando métodos específicos de cada animal
        cachorro.latir(); // O cachorro late
        gato.miar();      // O gato mia
    }
}


