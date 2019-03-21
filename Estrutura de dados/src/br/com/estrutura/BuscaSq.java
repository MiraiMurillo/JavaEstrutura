package br.com.estrutura;

public class BuscaSq {

	// Sequencial 
	
	public static int buscaSequencial(String vet[], String valor, int tamanho) {

		int i = 0;

		while ((i < tamanho) && (vet[i] != valor)) {
			i++;
		}
		
		if ((tamanho == 0) || (i >= tamanho))
			i = -1;

		return i;

	}
}
