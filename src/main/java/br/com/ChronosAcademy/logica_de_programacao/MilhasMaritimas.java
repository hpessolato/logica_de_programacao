package br.com.ChronosAcademy.logica_de_programacao;

public class MilhasMaritimas {

    public static void main(String[] args) {

        /* Sabendo que uma milha maritima equivale a um mil, oitocentos e cinquenta e dois metros
        e que um quilômetro possui mil metros, fazer um programa para converter milhas
        maritimas em quilometros.

        Dica: 1milha = 1852km
        1milha = 1.852km
        */

        int qtdMilhas = 4;
        float milha = 1852 / 1000f;

        float km = milha * qtdMilhas;

        String texto = "Resultado: ";
        System.out.println(texto+km+"km");

        /*
        float * float = float;
        float * int = float;
        int * int = int;

        float / float = float;
        float / int = float;
        int / int = int;
        */
    }
}
