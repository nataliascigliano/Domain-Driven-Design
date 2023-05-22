package Aula17;

import java.util.ArrayList;

public class GerenciadorContatoArrayList {
		
		private ArrayList<Contato> contatos; //declarando o ArrayList
		
		public GerenciadorContatoArrayList(){
			contatos = new ArrayList<Contato>(); //Criando o ArrayList
			//contatos, no plural, � o arraylist todo; no singular � o objeto Contato
			System.out.println("----Lista Criada----");
		}
		
		//criando um m�todo:
		public void adicionar(Contato c){
			contatos.add(c);
			System.out.println(c.getNome() + " foi adicionado na lista.");
		}
		
		public void atualizar(Contato c){
			contatos.set(int, String);
			contatos.add(c);
			System.out.println(c.getNome() + " foi atualizado.");
		}
		
		//m�todo para remover, mostrando o nome do contato que est� sendo removido
		// coloca-se o int porque nesse caso, vai ser informado a posi��o do ArrayList a ser removido
		public String remover(int i){
			//antes de remover, est� jogando o dado que vai ser removido para outro lugar:
			Contato c = contatos.get(i);
			contatos.remove(i);
			return c.getNome();		
		}
		
		public Contato remover(Contato c) {
			contatos.remove(c);
			return c;
		}
		
		//void porque agora vai retornar
		public void mostrar(){
			//percorrer a lista e imprimir elemento por elemento:
			for (Contato contato : contatos) {
				System.out.println(contato.toString());
			}
			
			System.out.println("--------------------");
			
			//percorrer a lista e imprimir elemento por elemento:
			for (int i = 0; i < contatos.size(); i++) {
				//como foi declarado um toString antes, para encapsular a informa��o, agora precisa DESENCAPSULAR para ver ele de novo.
				System.out.println(i+1 + " - " + contatos.get(i).toString());
			}
			
			
		}
		
	}

