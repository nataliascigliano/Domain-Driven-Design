package ArrayList;

import java.util.ArrayList;

/**
 * - Array List
 * - Array Din�mico
 * - Pode ser alterado em tempo de execu��o
 * - Framework Collection
 * - Java.util**/


public class Exemplo1 {
	public static void main(String[] args) {
		
		//Criar um ArrayList (Generics)
		ArrayList<String> carros = new ArrayList<String>();
		
		//Adicionar elementos no ArrayList carros, utilizando o m�todo add()
		carros.add("BMW");
		carros.add("Corsa");
		carros.add("Gol");
		carros.add("Monza");
		carros.add("Santana");
		
		//imprimir todos os elementos do ArrayList (lista)
		System.out.println(carros);
		
		//Acessar um elemento espec�fico do ArrayList utilizando o m�todo GET()
		System.out.println(carros.get(4));
		
		//como alterar um elemento do AyyaList utilizando o m�todo SET()
		//o 0 � onde coloca o elemento do arraylist a ser substitu�do
		//a string "Fusca" � onde vai o elemento a ser substitu�do
		carros.set(0, "Fusca");
		System.out.println(carros);
		
		//� poss�vel Remover um elemento do ArrayList
		carros.remove(0);
		System.out.println(carros);
		
		//apagar todos os elementos do ArrayList utilizando o m�todo clear()
		//    carros.clear();
		//    System.out.println(carros);
		
		//Obter o tamanho do ArrayList utilizando o m�todo size()
		System.out.println("Tamanho do Array: " + carros.size());
		
		//Como percorrer o ArrayList com um la�o FOR:
		//UTILIZANDO O .SIZE PORQUE SE TRATA DE UM OBJETO. Length � s� para arrays fixos.
		for(int i = 0; i < carros.size(); i+=1) {
			System.out.printf("%d - %s\n", i+1, carros.get(i));
		}
		
		System.out.println("------------------");
		
		//Percorrer o ArrayList com foreach
		int i = 0;
		for (String carro : carros) {
			System.out.printf("%d - %s\n", i+1, carro);
			i++;
		}
		
		System.out.println("***************");
		
		//OU ENT�O::::
		int j = 0;
		for (String carro : carros) {
			System.out.printf("%d - %s\n", ++j, carro);
		}
		
		System.out.println("------------------");
		
		//Obter o �ndice de um elemento espec�fico:
		System.out.println("�ndice: " + carros.indexOf("Monza"));
		
		
		//Verificar as ocorr�ncias de um determinado elemento utilizando CONTAINS:
		carros.contains(carros);
		System.out.println("Cont�m: " + carros.contains("Celta"));
		System.out.println("Cont�m: " + carros.contains("Santana"));
		
		
		//Operador Tern�rio = serve para "mascarar" a informa��o true ou false para o usu�rio
		// var/ teste ? true : false
		System.out.println("Cont�m: " + (carros.contains("Santana") ? "sim" : "n�o"));
		
		
		System.out.println("*-*-**-*-**-*-**-*-**-*-*");
		
		
		//ArrayList - Integer (int)
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(4);
		numeros.add(-2);
		numeros.add(10);
		numeros.add(1000);
		numeros.add(7);
		System.out.println(numeros);
		
		for (Integer n : numeros) {
			System.out.println("N�mero: " + n);
		}
		
	}
}
