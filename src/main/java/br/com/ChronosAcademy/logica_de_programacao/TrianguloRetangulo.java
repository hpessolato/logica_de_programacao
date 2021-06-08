package br.com.ChronosAcademy.logica_de_programacao;

/*
Verificar se três valores quaisquer (A,B, C) que serão digitados formam ou não um
 triângulo retângulo. Lembre-se que o quadrado da hipotenusa é igual a soma
  dos quadrados dos catetos.

 */
public class TrianguloRetangulo {
    public static void main(String[] args) {
        int valorA = 5;
        int valorB = 4;
        int valorC = 3;

        if (valorA * valorA == valorB * valorB + valorC * valorC) {
            System.out.println("É um triângulo retângulo");
        } else {
            System.out.println("Não é um triângulo retângulo");
        }
    }
}
