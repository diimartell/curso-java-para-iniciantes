package ESTRUTURA_CONTROLE;

public class Loops {
    public static void main(String[] args) {
        // Loop com While
        
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++; // Cada vez que passar pela estrutura, o contador é incrementado em 1 até atingir o valor condicional.
        }

        //Loop com For

        for (int i = 1; i <= 8; i++){ // O valor da variável i começa em 1 e vai até 8, incrementando de 1 em 1.
            System.out.println("O valor de i é: " + i);
        }
    }
}
