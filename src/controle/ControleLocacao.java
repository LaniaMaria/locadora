package controle;

import modelo.Filme;
import modelo.Locacao;
import modelo.Usuario;

public class ControleLocacao {

	
	public Locacao AlugarFilme(Usuario usuario, Filme filme) {
		
		Locacao locacao = new Locacao();
		
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		
		return locacao;
	}
	
	

}
