package br.com.ChronosAcademy.logica_de_programacao;

public class Media {

    /*
    Uma escola com cursos em regime semestral, realiza duas avaliações durante o
    semestre e calcula a média do aluno, da seguinte maneira:
    MEDIA = (P1 + 2P2) / 3

    Fazer um programa com os valores das notas (P1 e P2) e calcular a média.
    Exibir a situação final do aluno ("Aprovado" ou "Reprovado"), sabendo que
    a média da aprovação é igual a cinco.
    */

    public static void main(String[] args) {
        float p1 = 5;
        float p2 = 4.9f;
        float media = (p1 + 2 * p2) / 3;

        if(media >= 5){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
