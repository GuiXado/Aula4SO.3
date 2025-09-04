package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int vetor[] = new int[1000];
		int tamanho = vetor.length;
		
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = (int) (Math.random() * 100) + 1;
        }
		
		
		ThreadVetor t1 = new ThreadVetor(vetor, 1);
		t1.start();
		ThreadVetor t2 = new ThreadVetor(vetor, 2);
		t2.start();
	}
}