package br.edu.univas.vo;


import java.util.ArrayList;
import java.util.List;

public class JogoLoto {
	
	private String year;
	private String date;
	private List<String> numbers = new ArrayList<>();
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
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
	

}
