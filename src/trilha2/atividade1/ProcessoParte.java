package trilha2.atividade1;

public class ProcessoParte {
	
	private Parte parte;
	private Processo processo;
	private Advogado advogado;
	
	public ProcessoParte(Parte parte, Processo processo, Advogado advogado) {		
		this.parte = parte;
		this.processo = processo;
		this.advogado = advogado;
	}
	public Parte getParte() {
		return parte;
	}
	public void setParte(Parte parte) {
		this.parte = parte;
	}
	public Processo getProcesso() {
		return processo;
	}
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	public Advogado getAdvogado() {
		return advogado;
	}
	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}
	
	

}
