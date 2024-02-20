package numero;

public class Num {

	private String operacao;
	private int valor;

	public Num() {
		this.valor = 0;
	}

	public String getOperacao() {
		return this.operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}
}
