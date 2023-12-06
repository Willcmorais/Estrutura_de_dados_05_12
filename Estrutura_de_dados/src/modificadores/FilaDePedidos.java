package modificadores;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FilaDePedidos {
	public static void enfileirarPedidos() {

		System.out.println("-------------------Filas-------------------");
		Queue<RegistradorDePedidos> fila = new LinkedList();
		ArrayList<RegistradorDePedidos> listaDePedidos = GravadorDePedidos.gravarPedidos();

		for (RegistradorDePedidos pedidos : listaDePedidos) {
			fila.add(pedidos);
		}
		
		System.out.println("-------------------Topo: -------------------");
		System.out.println("");

		RegistradorDePedidos pedidosTopo = fila.peek();

		if (pedidosTopo != null) {
			System.out.println("Código: " + pedidosTopo.getCodigo());
			System.out.println("Data: " + pedidosTopo.getData());
			System.out.println("País: " + pedidosTopo.getPais());
			System.out.println("");
		}

		if (fila.size() >= 5) {
			for (int i = 0; i < 5; i++) {
				fila.remove();
			}
		}

		System.out.println("-------------------Depois de remover cinco elementos: -------------------");
		System.out.println("");

		for (RegistradorDePedidos pedidos : fila) {
			System.out.println("Código: " + pedidosTopo.getCodigo());
			System.out.println("Data: " + pedidosTopo.getData());
			System.out.println("País: " + pedidosTopo.getPais());
			System.out.println("");
		}
	}
}
