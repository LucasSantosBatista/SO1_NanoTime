package view;
import controller.NanoTimeController;

public class main {

	public static void main(String[] args) {
		int vet1[] = new int[1000];
		int vet2[] = new int[10000];
		int vet3[] = new int[100000];
		int tamanho1 = vet1.length;
		int tamanho2 = vet2.length;
		int tamanho3 = vet3.length;
		
		NanoTimeController tCont = new NanoTimeController();
		
		double tempoInicial = System.nanoTime();
		tCont.preencheVetor(vet1, tamanho1);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal/Math.pow(10,9);
		System.out.println("Teste 1, Vetor 1000 posições = " + tempoTotal + " seg");
		
		tempoInicial = System.nanoTime();
		tCont.preencheVetor(vet2, tamanho2);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal/Math.pow(10,9);
		System.out.println("Teste 2, Vetor 10000 posições = " + tempoTotal + " seg");
		
		tempoInicial = System.nanoTime();
		tCont.preencheVetor(vet3, tamanho3);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal/Math.pow(10,9);
		System.out.println("Teste 3, Vetor 100000 posições = " + tempoTotal + " seg");	
	}

}
