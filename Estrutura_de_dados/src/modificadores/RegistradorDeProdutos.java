package modificadores;

public class RegistradorDeProdutos {// // Atributos privados da classe para armazenar informações do produto
	private int codigo;
	private String descricao;
	private double preco;
	private int qtd;
	private int categoria;

	// Construtor da classe que recebe os dados do produto e inicializa os atributos
	public RegistradorDeProdutos(int codigo, String descricao, double preco, int qtd, int categoria) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.qtd = qtd;
		this.categoria = categoria;
	}

	// Métodos de acesso para obter e definir o código do produto
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// Métodos de acesso para obter e definir a descrição do produto
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// Métodos de acesso para obter e definir o preço do produto
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// Métodos de acesso para obter e definir a quantidade do produto
	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	// Métodos de acesso para obter e definir a categoria do produto
	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
}
