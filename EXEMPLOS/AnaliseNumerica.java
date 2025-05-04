package EXEMPLOS;

public class AnaliseNumerica {
  public static void main(String[] args) {
    // Soma dos números pares e ímpares de uma lista de números

    int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int somaPar = 0;
    int somaImpar = 0;

    for (int num : numeros) { 
      if (num % 2 == 0) { 
        somaPar += num; 
      } else { 
        somaImpar += num; 
      }

    }

    System.out.println("Soma dos números pares: " + somaPar);
    System.out.println("Soma dos números ímpares: " + somaImpar);
  }
}
