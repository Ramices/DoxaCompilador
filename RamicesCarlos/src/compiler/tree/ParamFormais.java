package compiler.tree;


public class ParamFormais {
	private String identificador;
	private Tipo tipo;
	
	public ParamFormais(String identificador, Tipo tipo)
	{
		this.identificador = identificador;
		this.tipo = tipo;
	}
	
	public Boolean verificarSemantica() {
		return null;
	}

	public String gerarCodigoIntermediario(String filename) {
		return null;
	}
	
}
