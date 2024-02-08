/*
Método Estático em Sobrecarga:
Desenvolva uma classe Conversor com métodos estáticos para converter temperatura de Celsius
para Fahrenheit e vice-versa. Utilize sobrecarga de métodos estáticos.
 */

// Definição da classe Conversor
public class Conversor {
    // Método estático para converter temperatura de Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Fórmula de conversão de temperatura
    }

    // Método estático para converter temperatura de Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Fórmula de conversão de temperatura
    }

    // Método main para teste dos métodos de conversão
    public static void main(String[] args) {
        // Conversão de temperatura de Celsius para Fahrenheit
        double temperaturaCelsius = 25.0;
        System.out.println(temperaturaCelsius + " Celsius = " + Conversor.celsiusParaFahrenheit(temperaturaCelsius) + " Fahrenheit");

        // Conversão de temperatura de Fahrenheit para Celsius
        double temperaturaFahrenheit = 77.0;
        System.out.println(temperaturaFahrenheit + " Fahrenheit = " + Conversor.fahrenheitParaCelsius(temperaturaFahrenheit) + " Celsius");
    }
}

