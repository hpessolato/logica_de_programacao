package br.com.ChronosAcademy.logica_de_programacao;

public class Triangulo {
    /*
    A partir de três valores, verificar se formam ou não um triângulo. Em caso
    positivo, exibir sua classificação: "Isóceles, escaleno ou equilátero".
    Um triângulo escaleno possui todos os lados diferentes,
    o isósceles, dois lados iguais e
    o equilátero, todos os lados iguais.
    Para existir triângulo é necessário que a soma de dois dados quaisquer seja maior
    que o outro, isto, para os três lados
    */

    public static void main(String[] args) {
        int ladoA = 12;
        int ladoB = 5;
        int ladoC = 6;

        if(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            if(ladoA == ladoB && ladoA == ladoC) {
                System.out.println("Triângulo Equilátero");

            }else if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
                System.out.println("Triângulo Escaleno");
            }else if((ladoA == ladoB && ladoA !=ladoC) ||
                    (ladoA == ladoC && ladoA !=ladoB) ||
                    (ladoB == ladoC && ladoB != ladoA)){
                System.out.println("Triângulo Isósceles");
            }
        }else{
            System.out.println("Os valores não correspondem a um triângulo");
        }
    }
}
