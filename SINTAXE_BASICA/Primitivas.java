package SINTAXE_BASICA;

public class Primitivas {
    
    public static void main(String[] args) {
        
        //Declaração de variáveis primitivas

        //Declaração de variáveis do tipo inteiro (números inteiros de 32 bits)
        int idade = 30;
        int anoNascimento = 1994;
        int anoAtual = 2024;

        System.out.println("Sua idade é: " + idade + " anos");
        System.err.println("Você nasceu no ano de: " + anoNascimento);
        System.out.println("Estamos no ano de: " + anoAtual);


        //Declaração de variáveis do tipo double (números de ponto flutuante de 64 bits)
        double altura = 1.70;
        double peso = 75.0;

        System.out.println("Sua altura é: " + altura + " metros");
        System.out.println("Seu peso é: " + peso + " kg");

        double pi = 3.14159265359;
        System.out.println("O valor de pi é: " + pi);


        //Declaração de variáveis do tipo boolean (valores lógicos - true ou false)
        boolean aprovado = true;
        boolean reprovado = false;

        System.out.println("Você foi aprovado? " + aprovado);
        System.out.println("Você foi reprovado? " + reprovado);


        //Declaração de variáveis do tipo char (caracteres de 16 bits)
        char sexo = 'F';
        char letra = 'I';

        System.out.println("Seu sexo é: " + sexo);
        System.out.println("A inicial do seu nome é: " + letra);


        //Declaração de variáveis do tipo byte (números inteiros de 8 bits)
        byte quantidadeBairros = 94;
        byte idadeMaxima = 127;

        System.out.println("A quantidade de bairros do Recife é: " + quantidadeBairros);
        System.out.println("A idade máxima é: " + idadeMaxima);

        
        //Declaração de variáveis do tipo short (números inteiros de 16 bits)
        short showRockInRio = 2026;
        short anoOlimpiadas = 2028;

        System.out.println("O próximo show do Rock in Rio será em: " + showRockInRio);
        System.out.println("As próximas Olimpíadas serão em: " + anoOlimpiadas);


        //Declaração de variáveis do tipo long (números inteiros de 64 bits)
        long populacaoMundial = 7800000000L;
        long distanciaTerraLua = 384400000L; 

        System.out.println("A população mundial é: " + populacaoMundial);
        System.out.println("A distância da Terra à Lua é: " + distanciaTerraLua);


        //Declaração de variáveis do tipo float (números de ponto flutuante de 32 bits)
        float salarioMinimo = 1412.00f;
        float salarioDevJava = 3445.50f;
        float salarioDevPython = 3200.00f;

        System.out.println("O salário mínimo é: " + salarioMinimo);
        System.out.println("O salário de um desenvolvedor Java é: " + salarioDevJava);
        System.out.println("O salário de um desenvolvedor Python é: " + salarioDevPython);

    }

}
