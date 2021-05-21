package br.com.ChronosAcademy.logica_de_programacao;

public class TempFahrenheit {

    public static void main(String[] args) {
        /* Com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
        Dica: Fahrenheit = celsius x 1.8 + 32
        */

        int celsius = 20;
        float multiplica = celsius * 1.8f;
        float fahrenheit = multiplica + 32f;

        String texto = "A temperatura em fahrenheit é: ";
        System.out.println(texto+fahrenheit);
    }
}
