package ListaExercicios2;

import java.util.Scanner;

public class SomaFracaoateN {
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Digite um n�mero natural N: ");
        int n = sc.nextInt();
        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }
        System.out.printf("A soma das fra��es de 1 at� %d � %.2f\n", n, soma);
    }
}
