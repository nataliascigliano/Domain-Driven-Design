package Aula9_metodos;

import java.util.Scanner;

public class testeConversor {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		conversor cv = new conversor();
		double celsius, fahrenheit;
		
		System.out.println("*-* Conversor *-*");
		System.out.println("Digite: ");
		System.out.println("1 p/ converter Celsius para Fahrenheit");
		System.out.println("2 p/ converter Fahrenheit para Celsius");
		int op = input.nextInt();
		
		if (op == 1) {
			System.out.println("Celsius: ");
			celsius = input.nextDouble();
			fahrenheit = cv.celsiusFahrenheit(celsius);
			System.out.println(celsius + "graus celsius �: "
					+ "equivalente � " + fahrenheit + "Fahrenheit.");	
		}else if (op == 2) {
			System.out.println("Fahrenheit: ");
			fahrenheit = input.nextDouble();
			celsius = cv.fahrenheitCelsius(fahrenheit);
			System.out.println(fahrenheit + "fahrenheit �: "
					+ "equivalente � " + celsius + "Celsius.");			
		}else {
			System.out.println("Opera��o Inv�lida.");
		}
		
		celsius = cv.fahrenheitCelsius(80);
		System.out.printf("Celsius: %.1f \n", celsius);
		
		fahrenheit = cv.celsiusFahrenheit(32);
		System.out.printf("Fahrenheit: %.1f \n", fahrenheit);
		
   }
	
	
	
	
}
