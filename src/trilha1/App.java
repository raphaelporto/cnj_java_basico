package trilha1;

public class App {

	public static void main(String[] args) {
		int numeroDeCasos = 10;
		int casoAtual = 1;
		int numeroInocentes = 0;
		
		while (casoAtual <= numeroDeCasos) {
			// código para imprimir o caso atual
			System.out.println("Caso " + casoAtual + ":");
			// Veredito: 1 para inocente e 2 para culpado
			int veredito = getVeredito();
			System.out.print("Veredito: ");
			System.out.println(veredito);
			
			
			
			if (veredito == 1) {
				// código para imprimir o veredito
				System.out.println("Veredito: Inocente");
				numeroInocentes++;				
			} else {
				// código para imprimir o veredito
				System.out.println("Veredito: Culpado");
			}

			System.out.println(); // imprimir linha em branco para pular linha
			casoAtual++;
		}
		
		System.out.print("Inocentes:");
		System.out.println(numeroInocentes);
		System.out.print("Culpados:");
		System.out.println(numeroDeCasos-numeroInocentes);
	}

	private static int getVeredito() {
		return (int) (Math.random() * 2) + 1;
	}

}
