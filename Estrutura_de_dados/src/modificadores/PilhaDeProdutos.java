package modificadores;

import java.util.ArrayList;
import java.util.Stack;/*Implementa uma estrutura de dados do tipo pilha (stack) que segue o princípio LIFO (Last In, First Out).
Possui métodos típicos de uma pilha, como push para adicionar elementos, pop para remover o elemento do topo e peek para obter o elemento no topo sem removê-lo.*/

public class PilhaDeProdutos {
	public static void empilharProdutos() {

		// Imprime um cabeçalho indicando que operações relacionadas a pilhas estão
		// acontecendo
		System.out.println("-------------------Pilhas-------------------");

		// Cria uma pilha (Stack) do tipo RegistradorDeProdutos
		Stack<RegistradorDeProdutos> pilha = new Stack();

		// Obtém uma lista de produtos usando o método gravarProdutos da classe
		// GravadorDeProdutos
		ArrayList<RegistradorDeProdutos> listaDeProdutos = GravadorDeProdutos.gravarProdutos();

		// Adiciona cada produto da listaDeProdutos à pilha utilizando o método push
		for (RegistradorDeProdutos produtos : listaDeProdutos) {
			pilha.push(produtos);
		}

		// Imprime um cabeçalho indicando o topo da pilha
		System.out.println("-------------------Topo: -------------------");
		System.out.println("");

		// Obtém o elemento no topo da pilha sem removê-lo usando o método peek
		RegistradorDeProdutos produtosTopo = pilha.peek();

		// Verifica se o topo da pilha não é nulo e imprime seus detalhes
		if (produtosTopo != null) {
			System.out.println("Código: " + produtosTopo.getCodigo());
			System.out.println("Descrição: " + produtosTopo.getDescricao());
			System.out.println("Preço: " + produtosTopo.getPreco());
			System.out.println("Quantidade: " + produtosTopo.getQtd());
			System.out.println("Categoria: " + produtosTopo.getCategoria());
			System.out.println("");
		}

		// Remove os cinco elementos do topo da pilha se ela tiver tamanho maior ou
		// igual a 5
		if (pilha.size() >= 5) {
			for (int i = 0; i < 5; i++) {
				pilha.pop();
			}
		}

		// Imprime um cabeçalho indicando os elementos restantes na pilha após a remoção
		// dos cinco do topo
		System.out.println("-------------------Depois de remover cinco elementos: -------------------");
		System.out.println("");

		// Itera sobre os elementos restantes na pilha e imprime os detalhes de cada
		// produto de trás para frente
		for (int i = pilha.size() - 1; i >= 0; i--) {
			RegistradorDeProdutos produto = pilha.get(i);
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQtd());
			System.out.println("Categoria: " + produto.getCategoria());
			System.out.println("");
		}
	}
}
