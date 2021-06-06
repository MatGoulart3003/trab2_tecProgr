package br.edu.univas.main;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import br.edu.univas.view.View;
import br.edu.univas.vo.*;

public class StartApp {
	
	public static void main(String[] args) {
		
		Scanner scan              = new Scanner (System.in);
		int aux;
		View view                 = new View();
		FileInputStream file      = null;
		
		
		List<JogoLoto> ListLoto   = new ArrayList<>();
		List<JogoMega> ListMega   = new ArrayList<>();
		List<JogoQuina> ListQuina = new ArrayList<>();		
		
		ListLoto  =   ReadLoto(file);		
		ListMega  =   ReadMega(file);
		ListQuina = ReadQuina (file);
	
		
		
		do {
			
			view.PrintMenuMain();
			aux = ReadInt(scan);
			MainMenu(aux,view, scan);
			
			
		}while (aux != 9);
		
		
		
	}
	
	public static List <JogoLoto>  ReadLoto (FileInputStream file) {
		
		List<JogoLoto> ListJogo = new ArrayList<>();
		
		
		try {
			
			file                    = new FileInputStream ("Files\\lotofacil.csv");
			InputStreamReader input = new InputStreamReader(file);
			
			try (BufferedReader buf = new BufferedReader (input)) {
				
				String line ; 
								
				do {
					
					JogoLoto jogo = new JogoLoto();
					line          = buf.readLine();
					
					if (line != null) {

						String[] auxs = line.split(",");
						
						jogo.setYear(auxs[0]);
						jogo.setDate(auxs[1]);
						
						for (int i = 2; i < auxs.length;i++) {
							
							jogo.setNumbers(auxs[i]);
							
						}
						ListJogo.add(jogo);
					}
				}
				while (line != null) ;
			}
		
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return ListJogo;
		
	}
	
	public static List <JogoMega>  ReadMega (FileInputStream file) {
		
		List<JogoMega> ListJogo = new ArrayList<>();
		
		
		try {
			
			file                    = new FileInputStream ("Files\\mega.csv");
			InputStreamReader input = new InputStreamReader(file);
			
			try (BufferedReader buf = new BufferedReader (input)) {
				
				String line ; 
								
				do {
					
					JogoMega jogo = new JogoMega();
					line          = buf.readLine();
					
					if (line != null) {

						String[] auxs = line.split(",");
						
						jogo.setYear(auxs[0]);
						jogo.setDate(auxs[1]);
						
						for (int i = 2; i < auxs.length;i++) {
							
							jogo.setNumbers(auxs[i]);
							
						}
						ListJogo.add(jogo);
					}
				}
				while (line != null) ;
			}
		
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return ListJogo;
	}

	public static List <JogoQuina> ReadQuina (FileInputStream file) {
		
		
		List<JogoQuina> ListJogo = new ArrayList<>();
		
		
		try {
			
			file                    = new FileInputStream ("Files\\quina.csv");
			InputStreamReader input = new InputStreamReader(file);
			
			try (BufferedReader buf = new BufferedReader (input)) {
				
				String line ; 
								
				do {
					
					JogoQuina jogo = new JogoQuina();
					line          = buf.readLine();
					
					if (line != null) {

						String[] auxs = line.split(",");
						
						jogo.setYear(auxs[0]);
						jogo.setDate(auxs[1]);
						
						for (int i = 2; i < auxs.length;i++) {
							
							jogo.setNumbers(auxs[i]);
							
						}
						ListJogo.add(jogo);
					}
				}
				while (line != null) ;
			}
		
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return ListJogo;
		
	}
	
	public static int ReadInt (Scanner scan) {
		
		int inteiro = scan.nextInt();
		scan.nextLine();
		
		return inteiro;
	}
	
	public static void MainMenu(int aux, View view, Scanner scan) {
		
		int aux2 = aux;
		
		if       (aux == 1) {
				
			view.PrintMenuSec();	
			aux = ReadInt(scan);
			MenuSec(aux, view, 6, 60);

		}else if (aux == 2) {
			
			view.PrintMenuSec();
			aux = ReadInt(scan);
			MenuSec(aux, view, 5, 80);
			
		}else if (aux == 3) {
			
			view.PrintMenuSec();
			aux = ReadInt(scan);
			MenuSec(aux, view,15,25);

		}else if (aux != 9) {
			
			view.PrintInvalidOption();
			aux = aux2;
		}
		
	}

	public static void MenuSec (int aux, View view, int numSort, int numMaxSort) {
				
		if       (aux == 1) {
				
			System.out.println("teste 1");	
				
		}else if (aux == 2) {
				
			System.out.println("teste 2");	
				
		}else if (aux == 3) {
				
			RandomNumber(numSort,numMaxSort);
							
		}else if (aux == 4) {
				
			System.out.println("teste 4");	
				
		}else if (aux > 5 || aux < 1) {
			
			view.PrintInvalidOption();
			
		}
					
	}

	public static void RandomNumber (int numSort, int numMaxSort) {
		
		DecimalFormat formatter = new DecimalFormat("00");
		
		List<Integer> listAll   = new ArrayList<>();
		List<Integer> list      = new ArrayList<>();
		
		for (int i = 0; i < numMaxSort; i++) {
			
			listAll.add(i+1);
			
		}
		
		for(int i = 0; i < numSort; i++) {
			
			Integer number = 0 + (int) (Math.random() * listAll.size());
			
			int aux = listAll.get(number);
			listAll.remove(number);
			list.add(aux);
			
		}
		
		for (Integer num : list) {
			String aFormatted = formatter.format(num);
			System.out.print(aFormatted + " ");
		} 
		System.out.println("");
	}
	
	

} 
