package br.com.ChronosAcademy.logica_de_programacao;
/*
Exibir a tabuada dos valores de um a vinte,
no intervalo de um a dez.

 */

public class TabuadaUmAoVinte {
    public static void main(String[] args) {

        for (int tabuada = 1; tabuada < 21; tabuada++) {
            System.out.println("###############");
            System.out.println("Tabuada do "+tabuada);
            for (int i = 1; i < 11; i++) {
                System.out.println(tabuada + " x " + i + " = " + tabuada * i);

            }
            
        }

    }
}
