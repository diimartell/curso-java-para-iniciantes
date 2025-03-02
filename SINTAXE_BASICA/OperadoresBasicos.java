package SINTAXE_BASICA;

public class OperadoresBasicos {
    public static void main(String[] args) {
        
        //Operadores Aritméticos

        //Declaração de variáveis numéricas
        int a = 20;
        double b = 2.0;
        float c = 4.0f;

        //Soma
        System.out.println("Soma: " + (a + b + c));

        //Subtração
        System.out.println("Subtração: " + (a - b - c));

        //Multiplicação
        System.out.println("Multiplicação: " + (a * b * c));

        //Divisão
        System.out.println("Divisão: " + (a / b / c));

        //Resto da divisão
        System.out.println("Resto da divisão: " + (a % 3));

        //Equação com os três operadores
        System.out.println("Equação: " + (a + b * c / 2 - 1));

        //Operadores de Incremento
        a++;
        System.out.println("Incremento: " + a);

        //Operadores de Decremento
        a--;
        a--;
        System.out.println("Decremento: " + a);

    }
}
