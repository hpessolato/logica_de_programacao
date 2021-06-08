package br.com.ChronosAcademy.logica_de_programacao;

// Com dois valores distintos. Exibir o menor deles.

public class MenorDistintos {
    public static void main(String[] args) {
        int valorA = 15;
        int valorB = 20;

        if (valorA < valorB) {
            System.out.println("O menor valor é:"+" "+ valorA);
        } else {
            System.out.println("O menor valor é:"+" "+ valorB);
        }
    }
}
