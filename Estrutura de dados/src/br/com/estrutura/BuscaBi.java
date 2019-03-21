package br.com.estrutura;

public class BuscaBi {

	//Busca binaria
	
	public static int buscaBinariaRecursiva( int menor, int maior, int chave) {
	
		int[] array = {1, 2, 4, 5, 7, 8, 10};
		
		int media = (maior + menor) / 2;
		
		int valorMeio = array[media];

		if (menor > maior)
			return -1;
		
		else if(valorMeio == chave) 
			return media;
		
		else if (valorMeio < chave)
			return buscaBinariaRecursiva( media+1, maior, chave);
		
		else
			return buscaBinariaRecursiva( menor, media-1, chave);
		
	}

}


