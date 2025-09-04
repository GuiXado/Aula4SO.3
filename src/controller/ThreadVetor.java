package controller;

public class ThreadVetor extends Thread  {
	private int[] vetor;
	private int num;
	
	public ThreadVetor() {}
	
	public ThreadVetor(int[] vetor, int num) {
		this.num = num;
		this.vetor = vetor;
	}
	int a;
	public void run() {
		double tempoInicial = System.nanoTime();
		int length = vetor.length;
		if (num % 2 == 0) {
			for (int i = 0 ; i < length; i++) {
				a = vetor[i];
			}
		} else {
			for (int t : vetor) {
				a = t;
			}
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.printf("Tamanho %d => %.8f s%n", num, tempoTotal);
		
	}

}
