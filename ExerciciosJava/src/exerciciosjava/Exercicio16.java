package exerciciosjava;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Quantidade de cigarros fumados por dia: ");
            int cigarrosPorDia = scanner.nextInt();
            
            System.out.print("Quantos anos já fumou? ");
            int anosFumando = scanner.nextInt();
            
            int totalCigarros = cigarrosPorDia * anosFumando * 365;
            int minutosPerdidos = totalCigarros * 10;
            double diasPerdidos = minutosPerdidos / (24.0 * 60);
            
            System.out.printf("O fumante perderá aproximadamente %.2f dias de vida.\n", diasPerdidos);
        }
    }
}