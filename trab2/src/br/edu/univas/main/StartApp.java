package br.edu.univas.main;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.*;

public class StartApp {
	
	public static void main(String[] args) {
		
		FileInputStream file      = null;
		
		List<JogoLoto> ListLoto   = new ArrayList<>();
		List<JogoMega> ListMega   = new ArrayList<>();
		List<JogoQuina> ListQuina = new ArrayList<>();		
		
		ListLoto  =   ReadLoto(file);		
		ListMega  =   ReadMega(file);
		ListQuina = ReadQuina (file);
		
		for (JogoLoto loto: ListLoto) {
			
			System.out.println("---------------------------------------------------------------");
			
			System.out.println(loto.getDate());
			System.out.println(loto.getYear());
			for (String number: loto.getNumbers()) {
				
				System.out.println(number);
				
			}
		}
		
		
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

}
