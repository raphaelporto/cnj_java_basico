package trilha2.atividade2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	private static List<Caso> casos = new ArrayList<Caso>(); 	
	private static Scanner scanner = new Scanner(System.in);
	private static char opcaoUsuario;

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
			
			casos.add(caso);
			
			System.out.println("Deseja registar um novo caso? ('S','N')");
			opcaoUsuario = scanner.nextLine().charAt(0);		
		}
		
		for (Caso caso : casos) {
			System.out.println(caso.toString());
		}
		
		scanner.close();

	}
}
