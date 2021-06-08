package br.com.ChronosAcademy.logica_de_programacao;

/*
Exibir os trinta primeiros valores da série de Fibonacci.
A série: 1, 1, 2, 3, 5, 8, ...

 */

public class Fibonacci {
    public static void main(String[] args) {

        int fibonacci = 0;
        int anterior = 1;

        for (int i = 1; i <= 30; i++){

        fibonacci = fibonacci + anterior;
        anterior = fibonacci - anterior;
            System.out.println(fibonacci);

        }
    }
}
