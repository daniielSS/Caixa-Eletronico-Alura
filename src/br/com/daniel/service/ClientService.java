package br.com.daniel.service;

import java.util.Scanner;

import br.com.daniel.model.Client;

public class ClientService {
	
	public static Client openTerminal(Client cliente) {
		
		String itemSelected;
		
		Scanner selected = new Scanner(System.in);
		itemSelected = selected.nextLine();
		
		return cliente;
	}
	
}
