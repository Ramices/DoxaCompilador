package compiler.tree;

import java.util.LinkedList;

public class Programa {
	private LinkedList<DeclGlobal> declaracoes;

	public Programa() {
		declaracoes = new LinkedList<DeclGlobal>();
	}

	public void addLast(DeclGlobal dec) {
		this.declaracoes.addLast(dec);
	}
	
	public Boolean verificarSemantica() {
		
		for(int i = 0; i < declaracoes.size(); ++i)
		{
			if( ! (declaracoes.get(i).verificarSemantica()))
				return false;
		}
		
		return true;
		
	}
	
	public String gerarCodigoIntermediario(String filename) {
		return null;
	}
}