package ListaExercicios2;

import java.util.Scanner;

public class SomaFracaoComplexa {
private static Scanner input;

public static void main(String[] args) {
        
        input = new Scanner(System.in);
        System.out.print("Digite um n�mero natural: ");
        int n = input.nextInt();
        
        double soma = 0;
        
        for(int i = n; i >= 1; i--){
            soma += 1.0 / i;
        }
        
        System.out.printf("A soma das fra��es �: %.2f", soma);
        
    }
}
