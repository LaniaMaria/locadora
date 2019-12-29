package modelo;

public class Filme {
	
	private String nome;
	private int estoque;
	private double precoLocacao;
	
	
	public Filme() {}
	
	public Filme(String nome, int estoque, double precoLocacao) {
		this.nome = nome;
		this.estoque = estoque;
		this.precoLocacao = precoLocacao;
				
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getPrecoLocacao() {
		return precoLocacao;
	}
	public void setPrecoLocacao(double precoLocacao) {
		this.precoLocacao = precoLocacao;
	}
	

}
