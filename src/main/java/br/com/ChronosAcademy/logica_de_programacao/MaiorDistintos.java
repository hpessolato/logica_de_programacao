package br.com.ChronosAcademy.logica_de_programacao;

public class MaiorDistintos {
    /*
        Com três valores distintos.
        Exibir o maior deles.
    */

    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 10;
        int valorC = 10;

        if (valorA > valorB && valorA > valorC) {
            System.out.println("O maior valor é: " + valorA);
        } else if (valorB > valorA && valorB > valorC) {
            System.out.println("O maior valor é: " + valorB);
        } else if (valorA == valorB && valorA == valorC) {
            System.out.println("Os valores são iguais");
        } else {
            System.out.println("O maior valor é: " + valorC);
        }
    }
}