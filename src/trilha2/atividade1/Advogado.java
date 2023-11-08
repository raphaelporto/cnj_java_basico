package trilha2.atividade1;

public class Advogado {
	
	private String nomeAdvogado;
	private String numeroOAB;
	
	public Advogado(String nomeAdvogado, String numeroOAB) {	
		this.nomeAdvogado = nomeAdvogado;
		this.numeroOAB = numeroOAB;
	}

	public String getNomeAdvogado() {
		return nomeAdvogado;
	}

	public void setNomeAdvogado(String nomeAdvogado) {
		this.nomeAdvogado = nomeAdvogado;
	}

	public String getNumeroOAB() {
		return numeroOAB;
	}

	public void setNumeroOAB(String numeroOAB) {
		this.numeroOAB = numeroOAB;
	}
	
	

	
}
