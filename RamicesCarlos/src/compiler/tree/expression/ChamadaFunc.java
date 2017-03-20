package compiler.tree.expression;

import java.util.LinkedList;

import compiler.tree.Tipo;
import compiler.tree.command.Comando;

public class ChamadaFunc implements Expressao, Comando {
	private String identificador;
	private LinkedList<Expressao> listaExprs;

	public ChamadaFunc(String identificador, LinkedList<Expressao> listaExprs) {
		this.identificador = identificador;
		this.listaExprs = listaExprs;
		
	}
	
	public void addLast(String identificador, LinkedList<Expressao> listaExprs)
	{
		this.identificador += "*";
		this.identificador += identificador;
		
		for(int i = 0; i < listaExprs.size(); ++i)
		{		
			this.listaExprs.addLast(listaExprs.get(i));
		}
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
