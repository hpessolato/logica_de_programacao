package br.com.ChronosAcademy.logica_de_programacao;

public class ConverterMoeda {

    public static void main(String[] args) {
        /* Com o valor da cotação do dólar e uma certa quantidade de dólares.
        Calcular e exibir o valor correspondente em Reais (R$).
        */

        int dolar = 10;
        int real = 5;
        int conversao = dolar * real;

        String texto = "O valor em reais é de: ";
        System.out.println(texto+conversao+"R$");
    }
}
