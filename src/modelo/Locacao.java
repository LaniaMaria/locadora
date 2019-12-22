package modelo;

import java.util.Date;

public class Locacao {

	private Usuario usuario;
	private Date dataLocacao;
	private Date dataRetorno;
	private Double valorLocacao;

	public Locacao(Usuario usuario, Date dataLocacao, Date dataRetorno, Double valorLocacao) {
		this.usuario = usuario;
		this.dataLocacao = dataLocacao;
		this.dataRetorno = dataRetorno;
		this.valorLocacao = valorLocacao;

	}

	public Date getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public Double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(Double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
