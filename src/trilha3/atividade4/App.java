package trilha3.atividade4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
	

	public static void main(String[] args) {
		try {
			
			File arquivo = new File("casos.txt");
			BufferedReader reader = new BufferedReader(new FileReader(arquivo));
			
			String linha = reader.readLine();
			while(linha != null) {
				System.out.println(linha);				
				String[] partes = linha.split(",");
				Caso caso = new Caso(Integer.parseInt(partes[0]), partes[1].charAt(0), partes[2]);
				System.out.println(caso);
				linha = reader.readLine();
			}
			
			reader.close();
					
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	

	}
}
