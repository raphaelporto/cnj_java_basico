package trilha3.atividade6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
	
	public static ArrayList casos = new ArrayList();
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			
			File arquivo = new File("casos.txt");
			BufferedReader reader = new BufferedReader(new FileReader(arquivo));
			
			String linha = reader.readLine();
			while(linha != null) {
				System.out.println(linha);				
				String[] partes = linha.split(",");
				Caso caso = new Caso(Integer.parseInt(partes[0]), partes[1].charAt(0), partes[2]);
				casos.add(caso);
				linha = reader.readLine();
			}
			
			reader.close();
			System.out.println(casos);
			Collections.sort(casos,new CasoComparator());
			System.out.println(casos);
			
			Caso casoEncontrado = buscaBinaria(22,casos,0,casos.size());
			System.out.println("Caso encontrado: "+casoEncontrado);
					
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	

	}
	
	public static Caso  buscaBinaria(int numeroCaso, ArrayList<Caso> casos, int inicio, int fim) {
		if(inicio == fim) {
			if(casos.get(inicio).getNumero() == numeroCaso) {
				return casos.get(inicio);
			} else {
				return null;
			}
		} else {
			int meio = (int) Math.floor((inicio + fim)/2);
			if(numeroCaso <= casos.get(meio).getNumero()) {
				return buscaBinaria(numeroCaso, casos, inicio, meio);
			} else {
				return buscaBinaria(numeroCaso, casos, meio + 1, fim);
			}
		}
	}

	public static class CasoComparator implements Comparator<Caso> {

		@Override
		public int compare(Caso o1, Caso o2) {
			return o1.getNumero()-o2.getNumero();
		}
	}
}

