package ArrayList2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	
	private int numero;
	private List<ItemPedido> itens;
	
	
	public Pedido(int numero){
		this.numero = numero;
		this.itens = new ArrayList<ItemPedido>();
	}
	
	//n�o tem o set porque n�o � para o usu�rio alterar nada, apenas ver o numero do pedido.
	public int getNumero() {
		return numero;
	}
	
	public void adicionarItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removerItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double getValorTotal() {
		double valorTotal = 0;
		for(ItemPedido item: itens) {
			//poderia ter definido um metodo para pegar o valor total, mas como n�o foi feito, teve que colocar getProduto e getPreco
			valorTotal += item.getProduto().getPreco();
		}
		return valorTotal;
	}
	
	public List<ItemPedido> getItens() {
		return itens;
	}
	
	
}
