package principal;

import controle.ControleLocacao;
import modelo.Filme;
import modelo.Locacao;
import modelo.Usuario;

public class Main {

	public static void main(String[] args) {
		
		Filme filme = new Filme("Cães de Aluguel", 2 , 50.00);
		Usuario usuario = new Usuario("Lania");
		ControleLocacao controle = new ControleLocacao();
		Locacao locacao = controle.AlugarFilme(usuario, filme);
		System.out.println(locacao.getFilme().getNome());
		System.out.println(locacao.getFilme().getEstoque());

	}

}
