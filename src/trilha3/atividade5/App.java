package trilha3.atividade5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {	
	
	private static Scanner scanner = new Scanner(System.in);
	private static char opcaoUsuario;
	private static Caso casoEncontrado = null;
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Deseja registar um novo caso? ('S','N')");
		opcaoUsuario =  scanner.nextLine().charAt(0);
		
		while(opcaoUsuario == 'S') {
			
			Caso caso;
			
			System.out.println("Digite uma descrição do caso: ");
			String descricao = scanner.nextLine();
			
			System.out.println("Digite o número do caso: ");
			int numero = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Digite a decisão do caso: ('A','I','C')");
			String decisao = scanner.nextLine();
			
			caso = new Caso(numero,decisao.charAt(0),descricao);
			
			salvarEmArquivo(caso);
			
			System.out.println("Deseja registar um novo caso? ('S','N')");
			opcaoUsuario = scanner.nextLine().charAt(0);		
		}
		
		escreverCasosDeArquivo();
	}
	
	public static void salvarEmArquivo(Caso caso) {
		try {
			
			String linha = caso.toString();
			
			File arquivo = new File("casos.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo,true));
			
			writer.newLine();
			writer.write(linha);
			writer.close();
					
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void escreverCasosDeArquivo() {
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
