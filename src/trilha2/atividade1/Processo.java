package trilha2.atividade1;

public class Processo {
	private String numeroProcesso;
	private ProcessoParte[] poloAtivo;
	private ProcessoParte[] poloPassivo;
	private Movimento[] movimentos;
	
	public Processo(String numeroProcesso, ProcessoParte[] poloAtivo, ProcessoParte[] poloPassivo, Movimento[] movimentos) {	
		this.numeroProcesso = numeroProcesso;
		this.poloAtivo = poloAtivo;
		this.poloPassivo = poloPassivo;
		this.movimentos = movimentos;
	}
	
	public String getNumeroProcesso() {
		return numeroProcesso;
	}
	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}
	public ProcessoParte[] getPoloAtivo() {
		return poloAtivo;
	}
	public void setPoloAtivo(ProcessoParte[] poloAtivo) {
		this.poloAtivo = poloAtivo;
	}
	public ProcessoParte[] getPoloPassivo() {
		return poloPassivo;
	}
	public void setPoloPassivo(ProcessoParte[] poloPassivo) {
		this.poloPassivo = poloPassivo;
	}

	public Movimento[] getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(Movimento[] movimentos) {
		this.movimentos = movimentos;
	}
	
	
	

}
