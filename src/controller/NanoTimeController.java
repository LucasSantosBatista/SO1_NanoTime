package controller;

public class NanoTimeController {
	public NanoTimeController() {
		super();
	}
	
	public void preencheVetor (int[] vet, int tamanho) {
		double tempoInicial = System.nanoTime();
		for (int i: vet) {
			vet[i] = 0;
		}
	}
}
