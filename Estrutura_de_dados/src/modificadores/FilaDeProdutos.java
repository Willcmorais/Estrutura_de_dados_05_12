package modificadores;

import java.util.ArrayList;
import java.util.LinkedList;/*Implementa uma lista encadeada, que é uma sequência de elementos onde cada elemento possui uma referência para o próximo na sequência.
Oferece operações de adição, remoção e manipulação de elementos com eficiência.*/
import java.util.Queue;/*Interface que representa uma estrutura de dados do tipo fila.
Estende a interface java.util.Collection e define comportamentos específicos para filas, como adicionar elementos, remover, inspecionar o elemento na frente da fila, etc.*/

public class FilaDeProdutos {
	public static void enfileirarProdutos() {

		// Imprime um cabeçalho indicando que operações relacionadas a filas estão
		// acontecendo
		System.out.println("-------------------Filas-------------------");

		// Cria uma fila utilizando a interface Queue e implementação LinkedList para
		// armazenar objetos RegistradorDeProdutos
		Queue<RegistradorDeProdutos> fila = new LinkedList();

		// Obtém uma lista de produtos usando o método gravarProdutos da classe
		// GravadorDeProdutos
		ArrayList<RegistradorDeProdutos> listaDeProdutos = GravadorDeProdutos.gravarProdutos();

		// Adiciona cada produto da listaDeProdutos à fila
		for (RegistradorDeProdutos produtos : listaDeProdutos) {
			fila.add(produtos);
		}

		// Imprime um cabeçalho indicando o topo da fila
		System.out.println("-------------------Topo: -------------------");
		System.out.println("");

		// Obtém o primeiro elemento da fila sem removê-lo usando o método peek
		RegistradorDeProdutos produtosTopo = fila.peek();

		// Verifica se o primeiro elemento não é nulo e imprime seus detalhes
		if (produtosTopo != null) {
			System.out.println("Código: " + produtosTopo.getCodigo());
			System.out.println("Descrição: " + produtosTopo.getDescricao());
			System.out.println("Preço: " + produtosTopo.getPreco());
			System.out.println("Quantidade: " + produtosTopo.getQtd());
			System.out.println("Categoria: " + produtosTopo.getCategoria());
			System.out.println("");
		}

		// Remove os primeiros cinco elementos da fila se ela tiver tamanho maior ou
		// igual a 5
		if (fila.size() >= 5) {
			for (int i = 0; i < 5; i++) {
				fila.remove();
			}
		}

		// Imprime um cabeçalho indicando os elementos restantes na fila após a remoção
		// dos cinco primeiros
		System.out.println("-------------------Depois de remover cinco elementos: -------------------");
		System.out.println("");

		// Itera sobre os elementos restantes na fila e imprime os detalhes de cada
		// produto
		for (RegistradorDeProdutos produtos : fila) {
			System.out.println("Código: " + produtos.getCodigo());
			System.out.println("Descrição: " + produtos.getDescricao());
			System.out.println("Preço: " + produtos.getPreco());
			System.out.println("Quantidade: " + produtos.getQtd());
			System.out.println("Categoria: " + produtos.getCategoria());
			System.out.println("");
		}
	}
}
