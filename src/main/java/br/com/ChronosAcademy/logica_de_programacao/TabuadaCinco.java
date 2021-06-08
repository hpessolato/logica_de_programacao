package br.com.ChronosAcademy.logica_de_programacao;

/*
Exibir a tabuada do número cinco no intervalo de um a dez.
*/

public class TabuadaCinco {
    public static void main(String[] args) {
        int tabuada = 5;

        for (int i = 1; i < 11; i++) {
            System.out.println(tabuada+ " x " +i+ " = "+ tabuada * i);

        }
    }
}
