package Aula_java;

import java.util.Scanner;

public class CalculaMedia {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in); //inst�ncia de objeto na classe Scanner
	 //float n1, n2, n3, media; //declara��o de vari�veis
	 
	 System.out.println("Digite seu nome: ");
	 String nome = input.nextLine();
	 
	 System.out.println("*---Digite as suas notas abaixo---*");
	 
	 System.out.println("N1: ");
	 float n1 = input.nextFloat();
	 
	 System.out.println("N2: ");
	 float n2 = input.nextFloat();
	 
	 System.out.println("N3: ");
	 float n3 = input.nextFloat();
	 
	 float media = (n1 + n2 + n3)/3;
	 
	 System.out.println( nome + ", a sua m�dia �: " + media);
	 
	 input.close();//serve para tirar os warnings que aparecem
 
 }
}
