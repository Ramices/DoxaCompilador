package compiler.tree.expression;


import compiler.tree.Tipo;
import compiler.tree.command.Comando;

public class ChamadaFuncCmd implements Expressao, Comando {
	
        private ChamadaFunc chamada_func;

	public ChamadaFuncCmd(ChamadaFunc chamada_func) {
		this.chamada_func = chamada_func;
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
