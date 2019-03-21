package br.com.estrutura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoHandler {
	
	
	public static String[] VetorCriar(String cam) {

		String caminho = cam;
		String[] vetorTxt = null;
		try {

			FileReader arquivo = new FileReader(caminho);

			BufferedReader leitorLinhas = new BufferedReader(arquivo);

			String linha = "";

			linha = leitorLinhas.readLine();

			int tamanhoVetor = Integer.parseInt(linha);

			vetorTxt = new String[tamanhoVetor + 1];
			int i = 0;

			while (linha != null) {

				vetorTxt[i] = linha;

				linha = leitorLinhas.readLine();

				i++;
			}
			arquivo.close();
			
		} catch (IOException erro) {
			System.out.println("Erro ao ler arquivo: " + erro.getMessage());
		}
		return vetorTxt;
	}
}
