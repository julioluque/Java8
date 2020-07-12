package ar.jluque.telmexhub.lambda;

public enum Sex {
	HH(1, "Hombre"), MM(2, "Mujer");

	private Integer codigo;
	private String valor;

	private Sex(Integer codigo, String valor) {
		this.codigo = codigo;
		this.valor = valor;

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
