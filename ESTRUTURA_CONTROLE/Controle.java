package ESTRUTURA_CONTROLE;

public class Controle {
    public static void main(String[] args) {
        
        /* Estruturas de Condicionais em Java

        Ex. Determinando se uma pessoa é maior ou menor de idade: */

        int idade = 23;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }   
        
        //Ex. Determinando se um aluno está aprovado ou reprovado:

        double nota = 6.3;
        if (nota >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        /* Usando o comparador "else if"

        Ex. Verificando a hora do dia e imprimindo uma mensagem de saudação: */

        int hora = 10;
        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
