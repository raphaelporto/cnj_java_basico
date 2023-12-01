package trilha3.atividade2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import trilha3.atividade1.Caso;

public class App {
	
	private static List casos = new ArrayList(); 	
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
			
			casos.add(caso);
			
			System.out.println("Deseja registar um novo caso? ('S','N')");
			opcaoUsuario = scanner.nextLine().charAt(0);		
		}
		
		int numeroCasoUsuario;
		
		System.out.println("Informe um número de caso para ser consultado:");
		numeroCasoUsuario =  Integer.parseInt(scanner.nextLine());
		
		casos.forEach((caso) -> {
			if (((Caso) caso).getNumero() == numeroCasoUsuario) {
				casoEncontrado = (Caso) caso;
			}
		});
		
		if (casoEncontrado != null) {
			System.out.println(casoEncontrado);
		} else {
			System.out.println("Caso não encontrado!");
		}
		
		scanner.close();

	}
}
