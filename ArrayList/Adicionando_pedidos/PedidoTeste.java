package ArrayList2;

public class PedidoTeste {
	
	public static void main(String[] args) {
		
		//criando objetos de produtos
		Produto produto1 = new Produto(1, "T�nis Nike", 799.99);
		Produto produto2 = new Produto(2, "Corta-Vento", 298.00);
		
		ItemPedido item1 = new ItemPedido(produto1, 1);
		ItemPedido item2 = new ItemPedido(produto1, 2);
		
		//esse 123 � o c�digo do pedido (interger)
		Pedido pedido = new Pedido(123);
		pedido.adicionarItem(item1);
		pedido.adicionarItem(item2);
		
		System.out.println("Numero do pedido: " + pedido.getNumero());
		System.out.println("Itens do pedido: ");
		for(ItemPedido item: pedido.getItens()) {
			//agora coloca um sysout para varrer os elementos da lista:
			//vai primeiro chamar o getProduto, para depois chamar o nome dele
			System.out.println("Produto: " + item.getProduto().getNome());
			System.out.println("Quantidade: " + item.getQuantidade());
			System.out.println("Subtotal: " + item.getSubTotal());
		}
		System.out.println("Valor total do pedido � de R$ " + pedido.getValorTotal());
		
	}
	
}
