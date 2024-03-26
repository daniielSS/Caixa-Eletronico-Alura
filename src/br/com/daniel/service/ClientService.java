package br.com.daniel.service;

import java.util.Scanner;

import br.com.daniel.command.ClientCommand;
import br.com.daniel.model.Client;

public class ClientService {
	
	public static Client openTerminal(Client cliente) {
		
		int itemSelected;
		
		Scanner selected = new Scanner(System.in);
		itemSelected = selected.nextInt();
		
		switch(itemSelected) {
		case 1:
			ClientCommand.accessAccount(cliente);
			break;
		case 2:
			ClientCommand.openAccount(cliente);
			break;
		default:
			System.out.println("Operação Inválida!");
			ClientCommand.openTerminal(cliente);
			break;
		}
		
		return cliente;
	}
	
	public static Client openAccount(Client cliente) {
		
		int itemSelected;
		int userCapacities = 10;
		int baseConta = 10100;
		int digito = 0;
		
		Scanner selected = new Scanner(System.in);
		itemSelected = selected.nextInt();
		
		if(itemSelected == 1) {
			System.out.print("Certo, digite seu nome completo: ");
			
			Scanner nome = new Scanner(System.in);
			cliente.nomeCliente = nome.nextLine();
			
			System.out.println("Agora escolha qual tipo de conta você deseja abrir:  ");
			System.out.println("                                                     ");
			System.out.println("1- Conta-poupança                                    ");
			System.out.println("                                                     ");
			System.out.println("2- Conta-corrente                                    ");
			System.out.println("                                                     ");
			System.out.print("Terminal: ");
			
			cliente.tipoConta = nome.nextLine();
			
			int valueParse = Integer.parseInt(cliente.tipoConta);
			
			if(valueParse != 1 && valueParse != 2) {
				System.out.println("Operação Inválida!");
			}
			
			if(valueParse == 1 || valueParse == 2) {
				for(int i = 0; i < userCapacities; i++) {
					
					cliente.idCliente = i;
					cliente.numeroConta = baseConta + 1;
					cliente.digitoConta = digito + 1;
					break;
					
				}
				
				switch(valueParse) {
				case 1:
					cliente.tipoConta = "Conta-poupança";
					break;
				case 2:
					cliente.tipoConta = "Conta-corrente";
					break;
				}
				
				System.out.println("Parabéns " + cliente.getNomeCliente() + "! Sua conta foi aberta com sucesso!");
				System.out.println("                                           ");
				System.out.println("Seus dados de acesso:                      ");
				System.out.println("                                           ");
				System.out.println("Nº Conta: " + cliente.getNumeroConta());
				System.out.println("                                           ");
				System.out.println("Tipo da Conta: " + cliente.getTipoConta());
				System.out.println("                                           ");
				System.out.println("Dígito: " + cliente.getDigitoConta());
			}
			
		}
		
		if(itemSelected == 2) {
			ClientCommand.openAccount(cliente);
		}
		
		return cliente;
	}
	
	public static Client accessAccount(Client cliente) {
		
		
		
		return cliente;
	}
	
}
