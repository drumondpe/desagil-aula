package br.edu.insper.desagil.aula2;

public class Tabuada {

	public String constroi(int n) {
		
		String resposta = "";
		for (int i=1; i<=n; i++) { //passa de 1 até n 
			for (int j=1; j<=n; j++) { //para cada número da sequencia de cima, eu vou multiplicá-lo por cada número de 1 até n e depois ainda preciso pular uma linha
				resposta += i*j + " ";
			}
			resposta += '\n';	
		}
		return resposta;
	}

}
