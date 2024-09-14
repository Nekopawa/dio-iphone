package iphone_projeto.model;

import iphone_projeto.interfaces.AparelhoTelefonico;
import iphone_projeto.interfaces.NavegadorInternet;
import iphone_projeto.interfaces.ReprodutorMusical;

public class Smartphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

	public void ligar(String numero) {
		System.out.println("ligando");
	}

	public void atender() {
		System.out.println("atendendo");
	}

	public void iniciarCorreioVoz() {
		System.out.println("iniciando correio de voz");
	}

	public void exibirPagina(String url) {
		System.out.println("exibindo página");
	}

	public void adicionarNovaAba() {
		System.out.println("adicionando nova aba");
	}

	public void atualizarPagina() {
		System.out.println("atualizando página");
	}

	public void tocar() {
		System.out.println("tocando");
	}

	public void pausar() {
		System.out.println("pausando");
	}

	public void selecionarMusica(String musica) {
		System.out.println("selecionando música");
	}

}
