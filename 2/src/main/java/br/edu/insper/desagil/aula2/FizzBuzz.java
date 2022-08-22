package br.edu.insper.desagil.aula2;

public class FizzBuzz {

	public String calcula(int n) {
		
		if (n%3 == 0 && n%5 != 0) {
			return "Fizz";
		}
		if (n%5 == 0 && n%3 != 0) {
			return "Buzz";
		}
		if (n%3 == 0 && n%5 == 0) {
			return "FizzBuzz";
		}
		
		return Integer.toString(n);
	}

}
