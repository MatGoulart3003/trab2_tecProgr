package br.edu.univas.main;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.JogoLoto;


public class StartApp {
	
	public static void main(String[] args) {
		
		FileInputStream file = null;
		JogoLoto listaLoto = new JogoLoto();
		FileReader(file, listaLoto);		
		
		System.out.println(listaLoto.getDate());
		System.out.println(listaLoto.getYear());
		for (String joguinho: listaLoto.getNumbers()) {
			
			System.out.println(joguinho);
			
		}
	}
	
	public static void FileReader (FileInputStream file, JogoLoto jogo) {
		
		try {
			
			file = new FileInputStream ("Files\\lotofacil.csv");
			InputStreamReader input = new InputStreamReader(file);
			
			try (BufferedReader buf = new BufferedReader (input)) {
				
				String line ; 
								
				do {
					line = buf.readLine();
					if (line != null) {

						String[] auxs = line.split(",");
						
						jogo.setYear(auxs[0]);
						jogo.setDate(auxs[1]);
						
						for (int i = 2; i < auxs.length;i++) {
							
							jogo.setNumbers(auxs[i]);
							
						}
					}
					
				}
				while (line != null) ;
			}
		
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
