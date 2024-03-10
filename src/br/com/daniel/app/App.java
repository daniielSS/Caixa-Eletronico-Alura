package br.com.daniel.app;

import br.com.daniel.command.ClientCommand;
import br.com.daniel.model.Client;

public class App {

	public static void main(String[] args) {
		
		ClientCommand terminal = new ClientCommand();
		Client cliente = new Client();
		
		terminal.openTerminal(cliente);

	}

}
