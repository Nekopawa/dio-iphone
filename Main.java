package iphone_projeto;

import iphone_projeto.model.Smartphone;

public class Main {

	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone();

		smartphone.tocar();
		smartphone.pausar();
		smartphone.selecionarMusica("Die4U");

		smartphone.ligar("555");
		smartphone.atender();
		smartphone.iniciarCorreioVoz();

		smartphone.exibirPagina("Heh");
		smartphone.adicionarNovaAba();
		smartphone.atualizarPagina();
	}
}
