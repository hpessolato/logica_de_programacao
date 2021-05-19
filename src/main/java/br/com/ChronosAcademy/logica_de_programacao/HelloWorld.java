package br.com.ChronosAcademy.logica_de_programacao;

public class HelloWorld {

    public static void main(String[] args) {
        //Imprimir o texto Hello World
        /*
        * primeira linha comentario
        * segunda linha comentario
        */

        System.out.println("Hello World");

        boolean encontrado = false;
        encontrado = true;

        System.out.println(encontrado);

        char varChar = 'A';
        float varFloat = 12.5f;
        double varDouble = 12.5;

        byte varByte = 127;
        short varShort = 32767;
        int varInt = 2147483647;
        long varLong = 9223372036854775806l;

        String nome = "Humberto";
        Integer idade = 39;

        System.out.println(varChar);
        System.out.println(varFloat);
        System.out.println(varDouble);

        System.out.println(varByte);
        System.out.println(varShort);
        System.out.println(varInt);
        System.out.println(varLong);

        System.out.println(nome);
        System.out.println(idade);
    }
}
