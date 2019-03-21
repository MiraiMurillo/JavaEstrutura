package br.com.estrutura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Saida {

	public class WriteToFileExample {
		
	    public void main(String[] args) {
	        try {

	            String content = "./Saída/saída.txt";

	            File file = new File("./Linguagem/dic.txt");

	            // if file doesn't exists, then create it
	            if (!file.exists()) {
	                file.createNewFile();
	            }

	            FileWriter fw = new FileWriter(file.getAbsoluteFile());
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write(content);
	            bw.close();

	            System.out.println("Done");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
