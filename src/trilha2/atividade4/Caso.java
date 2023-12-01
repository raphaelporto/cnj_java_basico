package trilha2.atividade4;

public class Caso {
	private int numero;
	private String decisao;
	private String descricao;
	
	public Caso(int numero, String decisao, String descricao) {
		this.numero = numero;
		this.decisao = decisao;
		this.descricao = descricao;				
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDecisao() {
		return this.decisao;
	}

	public void setDecisao(String decisao) {
		this.decisao = decisao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Caso [numero=" + numero + ", decisao=" + decisao + ", descricao=" + descricao + "]";
	}	

}
