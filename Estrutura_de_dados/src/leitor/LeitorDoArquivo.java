package leitor;

import java.io.File;/*Oferece funcionalidades para manipulação de arquivos e diretórios no sistema de arquivos.
Permite a criação, leitura, gravação, exclusão e verificação de informações sobre arquivos.*/
import java.io.FileNotFoundException;//É lançada quando um arquivo é solicitado e não é encontrado no local especificado ou não pode ser acessado por alguma razão.
import java.util.ArrayList;
import java.util.Scanner;
import modificadores.RegistradorDeProdutos;

public class LeitorDoArquivo {
	public static ArrayList<RegistradorDeProdutos> lerProdutos() {

		// Define o caminho do arquivo a ser lido
		String caminhoArquivo = "C:\\Users\\conhe\\Downloads\\EstruturaDeDadosProva\\Produto.txt";

		// Cria uma lista para armazenar os produtos lidos do arquivo
		ArrayList<RegistradorDeProdutos> listaDeProdutos = new ArrayList<>();

		try { // Abre o arquivo usando o caminho especificado
			File arquivo = new File(caminhoArquivo);
			Scanner leitor = new Scanner(arquivo);

			// Lê o arquivo linha por linha
			while (leitor.hasNextLine()) {

				// Lê uma linha do arquivo
				String linha = leitor.nextLine();

				// Extrai informações da linha para criar um objeto RegistradorDeProdutos
				int codigo = Integer.parseInt(linha.substring(0, 2));
				String nome = linha.substring(3, 34);
				String valors = linha.substring(36, 41);
				double valor = Double.parseDouble(valors) / 100;
				int qtd = Integer.parseInt(linha.substring(43, 45));
				int categoria = Integer.parseInt(linha.substring(46, 47));

				// Cria um novo objeto RegistradorDeProdutos com as informações extraídas e
				// adiciona à lista
				RegistradorDeProdutos produto = new RegistradorDeProdutos(codigo, nome, valor, qtd, categoria);
				listaDeProdutos.add(produto);
			}

			// Fecha o scanner após a leitura do arquivo
			leitor.close();
		} catch (FileNotFoundException e) {

			// Trata a exceção se o arquivo não for encontrado
			System.out.println("Arquivo não encontrado: " + caminhoArquivo);
		}

		// Retorna a lista de produtos lidos do arquivo
		return listaDeProdutos;
	}
}
