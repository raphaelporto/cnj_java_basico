package trilha2.atividade1;

public class Movimento {
	
	private int codigoMovimento;
	private String movimento;
	
	public Movimento(int codigoMovimento, String movimento) {
		super();
		this.setCodigoMovimento(codigoMovimento);
		this.setMovimento(movimento);
	}

	public int getCodigoMovimento() {
		return codigoMovimento;
	}

	public void setCodigoMovimento(int codigoMovimento) {
		this.codigoMovimento = codigoMovimento;
	}

	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	
	

}
