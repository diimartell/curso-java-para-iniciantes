package ESTRUTURA_CONTROLE;

public class OperadoresComp {
    public static void main(String[] args) {
        int x = 14;
        int y = 3;

        //Operadores de comparação
        System.out.println("x == y: " + (x == y)); // false
        System.out.println("x != y: " + (x != y)); // true
        System.out.println("x > y: " + (x > y)); // true
        System.out.println("x < y: " + (x < y)); // false
        System.out.println("x >= y: " + (x >= y)); // true
        System.out.println("x <= y: " + (x <= y)); // false

        // Operadores lógicos

        /*  && (AND) - retorna true se ambos os operandos forem verdadeiros
        || (OR) - retorna true se pelo menos um dos operandos for verdadeiro
        ! (NOT) - inverte o valor lógico do operando */

        boolean temDinheiro = true;
        boolean temTempo = true;

        if (temDinheiro && temTempo) {
            System.out.println("Você pode viajar");
        } else {
            System.out.println("Você não pode viajar.");
        }
    }
}