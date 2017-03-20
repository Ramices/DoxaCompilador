package compiler.tree.expression;

import compiler.tree.Tipo;

public class IntLiteral implements Expressao {
	private int intLiteral;

	public IntLiteral(int intLiteral) {
		this.intLiteral = intLiteral;
	}
	
	@Override
	public Boolean verificarSemantica() {
		return null;
	}

	@Override
	public Tipo getTipo() {
		return null;
	}

	@Override
	public String gerarCodigoIntermediario(String filename) {
		return null;
	}
}
