package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class JogoLoteria {

	
	private String NumGame;
	private String date;
	private List<String> numbers = new ArrayList<>();
	
	public String getNumGame() {
		return NumGame;
	}
	public void setNumGame(String year) {
		this.NumGame = year;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<String> getNumbers() {
		return numbers;
	}
	public void setNumbers(String number) {
		this.numbers.add(number);
	}	
	
	@Override
	public String toString() {
		return NumGame + " " + date;
	}
	
}
