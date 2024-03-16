package view_exercicio_4;

import controller_exercicio_4.Produto;

public class Main_Exercicio_4 {
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		//testando Validação Preço e Estoque
		produto.setPreco(0);
		produto.setQtdEsqtoque(-5);
		
		//Testando Métodos
		produto.setNome("Smartphone");
		produto.setPreco((float) 5999.99);
		produto.setQtdEsqtoque(50);
		
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
		System.out.println((produto.getQtdEsqtoque()));
		System.out.println(produto.verificaProdutoDisponivel("Smartphone"));
		System.out.println(produto.verificaProdutoDisponivel("Tablet"));
		System.out.println(produto.totalValorEstoque());
		
		
	}
}
