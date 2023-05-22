package ListaExercicios2;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //leitura de um n�mero N digitado pelo usu�rio
        System.out.print("Digite um n�mero inteiro N (N < 46): ");
        int n = sc.nextInt();
        
        int anterior = 0, atual = 1, proximo;
        
        System.out.print(anterior + " " + atual);
        
        for (int i = 2; i < n; i++) {
            proximo = anterior + atual;
            System.out.print(" " + proximo);
            anterior = atual;
            atual = proximo;
        }
        
        System.out.println();
        sc.close();
    }
}
