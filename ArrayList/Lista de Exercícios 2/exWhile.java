package ListaExercicios2;

import java.util.Scanner;

public class exWhile {
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int n = input.nextInt();
		System.out.println("Voc� digitou o n�mero: " + n);
		
		int i = 1;
		int soma = 0;
		
		while (i<=n) {
			soma +=1;
			i++;
		}
		 System.out.println("A soma de todos os n�meros inteiros de 1 at� " + n + " � igual � " + soma + ".");
	
		
	}
}
