package br.com.daniel.command;

import br.com.daniel.model.Client;
import br.com.daniel.service.ClientService;

public class ClientCommand {
	
	private ClientService clientService;
	
	public static Client openTerminal(Client cliente) {
		
		System.out.println("*******************************************************************");
		System.out.println("*                                                                 *");
		System.out.println("*                       BANCO SILVA'S TERMINAL                    *");
		System.out.println("*                                                                 *");
		System.out.println("*                           SEJA BEM-VINDO!                       *");
		System.out.println("*                                                                 *");
		System.out.println("*******************************************************************");
		System.out.println("*                                                                 *");
		System.out.println("* Para iniciar, digite a opção desejada:                          *");
		System.out.println("*                                                                 *");
		System.out.println("* 1- Acessar Conta                                                *");
		System.out.println("*                                                                 *");
		System.out.println("* 2- Abrir uma Conta                                              *");
		System.out.println("*                                                                 *");
		System.out.println("*******************************************************************");
		System.out.print(" Terminal: ");
		
		ClientService.openTerminal(cliente);
		
		return cliente;
	}
	
	public static Client openAccount(Client cliente) {
		
		System.out.println("*******************************************************************");
		System.out.println("*                                                                 *");
		System.out.println("*                       BANCO SILVA'S TERMINAL                    *");
		System.out.println("*                                                                 *");
		System.out.println("*******************************************************************");
		System.out.println("*                                                                 *");
		System.out.println("* Feliz em saber que deseja fazer parte da nossa comunidade :)    *");
		System.out.println("*                                                                 *");
		System.out.println("* Nosso processo de abertura é muito simples, vamos começar?      *");
		System.out.println("*                                                                 *");
		System.out.println("* 1- Iniciar                                                      *");
		System.out.println("*                                                                 *");
		System.out.println("* 2- Voltar                                                       *");
		System.out.println("*                                                                 *");
		System.out.println("*******************************************************************");
		System.out.print(" Terminal: ");
		
		ClientService.openAccount(cliente);
		
		return cliente;
	}
	
	public static Client accessAccount(Client cliente) {
		
		
		
		return cliente;
	}
	
}
