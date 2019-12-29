package principal;

import java.util.Scanner;

import controle.ControleLocacao;
import modelo.Filme;
import modelo.Locacao;
import modelo.Usuario;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do Filme");
		String nome = sc.nextLine();
		
		System.out.println("Digite quantidade de Filmes");
		int quantidade = sc.nextInt();
		
		System.out.println("Digite Preço do Filme");
		double precoLocacao = sc.nextDouble();	
		
		String lixo = sc.nextLine();
		
		Filme filme = new Filme(nome, quantidade, precoLocacao);
			
		System.out.println("Digite o nome do Usuario");
		String nomeUsuario = sc.nextLine();
		
		Usuario usuario = new Usuario(nomeUsuario);
		
		ControleLocacao controle = new ControleLocacao();
		Locacao locacao = controle.alugarFilme(usuario, filme);
		System.out.println("Nome do filme é: "+locacao.getFilme().getNome());
		System.out.println("Quantidade de Filmes: "+locacao.getFilme().getQuantidade());
		System.out.println("Valor Unitario por Filme é: "+locacao.getFilme().getPrecoLocacao());
		System.out.println("Nome do Usuário é: "+locacao.getUsuario().getNome());

	}

}
