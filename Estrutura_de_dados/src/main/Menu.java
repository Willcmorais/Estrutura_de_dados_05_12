package main;

import modificadores.FilaDeProdutos;
import modificadores.GravadorDeProdutos;
import modificadores.PilhaDeProdutos;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;// Declara uma variável opcao para armazenar a escolha do usuário.

		do {// O programa entra em um loop do-while que continuará a ser executado até que o
			// usuário escolha a opção 0 para sair
			System.out.println("### MENU ###");
			System.out.println("1. Chamar Gravador");
			System.out.println("2. Chamar Fila");
			System.out.println("3. Chamar Pilha");
			System.out.println("0. Sair do programa");
			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextInt();
			scanner.nextLine();// para consumir a quebra de linha.

			switch (opcao) {
			case 1:// Caso 1: Chama o método gravarProdutos() da classe GravadorDeProdutos
				System.out.println("Chamando Gravador...");
				GravadorDeProdutos.gravarProdutos();
				break;
			case 2:// Caso 2: Chama o método enfileirarProdutos() da classe FilaDeProdutos
				System.out.println("Chamando Fila...");
				FilaDeProdutos.enfileirarProdutos();
				break;
			case 3:// Caso 3: Chama o método empilharProdutos() da classe PilhaDeProdutos
				System.out.println("Chamando Pilha...");
				PilhaDeProdutos.empilharProdutos();
				break;
			case 0:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida! Escolha novamente.");
				break;
			}
		} while (opcao != 0);

		scanner.close();
	}
}
