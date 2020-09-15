package controller;

public class Threads extends Thread{
	private int[] vet = new int[5];
	int line;
	
	public Threads(int[] vet, int line){
		this.vet = vet;
		this.line = (line + 1);
	}
	
	public void run() {
		int soma = 0;
		for (int i = 0; i < this.vet.length; i ++) {
			soma = soma + vet[i];
		}
		System.out.println("ID da Thread:" + getId());
		System.out.println("Linha: " + this.line);
		System.out.println("Soma: " + soma + "\n");		
	}
}