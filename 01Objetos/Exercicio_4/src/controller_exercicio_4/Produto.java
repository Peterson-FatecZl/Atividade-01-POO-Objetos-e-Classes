package controller_exercicio_4;

public class Produto {

	private String nome;
	private float preco;
	private int qtdEstoque;

	// Contrutores
	public Produto() {
		this.nome = "";
		this.preco = 0;
		this.qtdEstoque = 0;
	}

	// Metodos
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Nome Registrado");
	}

	public float getPreco() {
		return this.preco;
	}

	public void setPreco(float preco) {
		if(preco > 0 ) {
			this.preco = preco;
			System.out.println("Preço Registrado");
			
		}else {
			System.out.println("Valor Inválido");
		}
	}

	public int getQtdEsqtoque() {
		return this.qtdEstoque;
	}

	public void setQtdEsqtoque(int qtdEstoque) {
		if(qtdEstoque > 0 ) {
			this.qtdEstoque = qtdEstoque;
			System.out.println("Quantidade Registrada");
			
		}else {
			System.out.println("Quantidade Inválida");
		}
	}

	public boolean verificaProdutoDisponivel(String nome) {
		if(nome == this.nome) {
			return true;
		}else {
			return false;
		}
	}

	public float totalValorEstoque() {
		float valorTotalEmEstoque = this.preco * this.qtdEstoque;
		return valorTotalEmEstoque;
	}

}