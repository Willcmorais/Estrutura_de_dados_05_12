package modificadores;

import java.util.ArrayList;/*Representa uma estrutura de dados dinâmica do tipo lista/array.
Permite armazenar elementos em uma sequência ordenada e redimensionável.
Fornece métodos para manipular os elementos, como adicionar, remover, buscar, etc.*/
import leitor.LeitorDoArquivo;

public class GravadorDeProdutos {
	public static ArrayList<RegistradorDeProdutos> gravarProdutos() {

		// Criação de um ArrayList para armazenar objetos RegistradorDeProdutos
		ArrayList<RegistradorDeProdutos> listaDeProdutos = LeitorDoArquivo.lerProdutos();

		// Adiciona novos produtos à lista de produtos
		listaDeProdutos.add(new RegistradorDeProdutos(78, "Produto A", 10.99, 100, 1));
		listaDeProdutos.add(new RegistradorDeProdutos(79, "Produto B", 5.99, 50, 2));
		listaDeProdutos.add(new RegistradorDeProdutos(80, "Produto C", 7.49, 75, 3));

		// Itera sobre a lista de produtos e imprime detalhes de cada produto
		for (RegistradorDeProdutos produto : listaDeProdutos) {
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQtd());
			System.out.println("Categoria: " + produto.getCategoria());
			System.out.println("");
		}

		// Retorna a lista atualizada de produtos
		return listaDeProdutos;
	}
}
