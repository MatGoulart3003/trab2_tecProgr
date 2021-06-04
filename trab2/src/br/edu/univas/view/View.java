package br.edu.univas.view;

public class View {
	
	public void PrintHello() {
		
		System.out.println(":::::: BEM VINDO AO ASSISTENTE DE JOGOS DE LOTERIA!! ::::::::");
		
	}
	
	
	
	public void PrintMenuMain()	{
		
		System.out.println("Selecione uma das opções abaixo:");
		System.out.println("1 - Mega Sena");
		System.out.println("2 - Quina");
		System.out.println("3 - Loto-Fácil");
		System.out.println("9 - Sair\n\n\n");
		
	}
	
	public void PrintMenuSec () {
		
		System.out.println("Selecione agora uma das opções abaixo:");
		System.out.println("1 - 5 números que mais saíram");
		System.out.println("2 - 5 números que menos saíram");
		System.out.println("3 - Gerar números randômicos");
		System.out.println("4 - Verificar meu jogo\n\n\n");
		
		
	}
	
}
