package trilha2.atividade3;

import java.time.LocalDate;

public class Caso {
	private int numero;
	private char decisao;
	private String descricao;
	private LocalDate dataAbertura;
	private LocalDate dataEncerramento;
	
	public Caso(int numero, char decisao, String descricao,LocalDate dataAbertura, LocalDate dataEncerramento) {
		this.numero = numero;
		this.decisao = decisao;
		this.descricao = descricao;				
		this.dataAbertura = dataAbertura;
		this.dataEncerramento = dataEncerramento;
	}
	
	public boolean temVeredito() {
		switch(decisao) {
		case 'A':
			return true;
		case 'I':
			return true;
		case 'C':
			return true;			
		default:
			return false;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getDecisao() {
		return decisao;
	}

	public void setDecisao(char decisao) {
		if (decisao == 'A' || decisao == 'I' || decisao == 'C') {
			this.decisao = decisao;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public LocalDate getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(LocalDate dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	@Override
	public String toString() {
		return "Caso [numero=" + numero + ", decisao=" + decisao + ", descricao=" + descricao + ", dataAbertura="
				+ dataAbertura + ", dataEncerramento=" + dataEncerramento + "]";
	}



	public class Depoimento {
		private String nomeTestemunha;
		private String conteudo;
		
		public Depoimento(String nomeTestemunha, String conteudo) {			
			this.nomeTestemunha = nomeTestemunha;
			this.conteudo = conteudo;
		}

		public String getNomeTestemunha() {
			return nomeTestemunha;
		}

		public void setNomeTestemunha(String nomeTestemunha) {
			this.nomeTestemunha = nomeTestemunha;
		}

		public String getConteudo() {
			return conteudo;
		}

		public void setConteudo(String conteudo) {
			this.conteudo = conteudo;
		}
		
	}
	
	
	

}
