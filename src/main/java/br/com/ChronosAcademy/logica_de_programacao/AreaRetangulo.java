package br.com.ChronosAcademy.logica_de_programacao;

/*Calcular e exibir a área de um retângulo, a partir dos valores da base
 e altura que serão digitados. Se a área for maior que 100, exibir a mensagem
 “Terreno grande”.
*/

public class AreaRetangulo {
    public static void main(String[] args) {

        int base = 5;
        int altura = 12;
        int retângulo = base * altura;

        if(retângulo>=100){
            System.out.println("Terreno grande");
        }else{
            System.out.println("A área do retângulo é: " + retângulo);
        };

    }
}
