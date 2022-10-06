import java.util.Scanner;

/**
 * Faça um programa que leia o código dos itens pedidos e as quantidades
 * desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade)
 * e o total geral do pedido. Considere que o cliente deve informar quando o
 * pedido deve ser encerrado.
 * 
 * @author Lucas Andrin
 *
 */
public class CardapioMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continuar = true;
		Cardapio cardapio = new Cardapio();
		
		System.out.println(cardapio.getCardapio());
		do {
			System.out.print("Entre com o código do item: ");
			int id = input.nextInt();
			System.out.print("Entre com a quantidade do item: ");
			int qtd = input.nextInt();
			
			cardapio.setItens(id, qtd);
			
			System.out.print("Deseja continuar?");
			continuar = input.nextBoolean();
		} while (continuar);
		
		for (int id = 0; id < cardapio.getItens().length; id++) {
			System.out.println(id + " R$" + cardapio.getTotalItem(id));
		}
		
		System.out.println("Total: R$" + cardapio.getTotal());
		
		input.close();
	}

}
