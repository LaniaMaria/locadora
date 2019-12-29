package modelo;

public class Filme {
	
	private String nome;
	private int quantidade;
	private double precoLocacao;
	
	
	public Filme() {}
	
	public Filme(String nome, int quantidade, double precoLocacao) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoLocacao = precoLocacao;
				
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPrecoLocacao() {
		return precoLocacao;
	}
	public void setPrecoLocacao(double precoLocacao) {
		this.precoLocacao = precoLocacao;
	}
	

}
