package SINTAXE_BASICA;

public class Referencia {
    public static void main(String[] args) {
        
        //Declaração de variáveis de referência

        //Declaração de variáveis do tipo String (cadeia de caracteres)
        String nome = "Ingrid";
        String sobrenome = "Silva";
        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu sobrenome é: " + sobrenome);
        System.out.println("Seu nome completo é: " + nomeCompleto);


        //Declaração de variáveis do tipo Object (instância de classes em Java)
        Object objeto = new Object();
        Object objeto2 = new Object();

        System.out.println("O objeto é: " + objeto);
        System.out.println("O objeto 2 é: " + objeto2);


        //Declaração de variáveis do tipo Array (coleção de valores de mesmo tipo)
        int[] numeros = {1, 2, 3, 4, 5};
        String[] frutas = {"Maçã", "Banana", "Uva", "Morango"};

        System.out.println("Os números são: " + numeros);
        System.out.println("As frutas são: " + frutas); 
        
    }
}
