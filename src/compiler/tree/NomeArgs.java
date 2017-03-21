package compiler.tree;

import java.util.LinkedList;
import java.util.List;

import compiler.table.SymbolTable;
import compiler.tree.command.DeclVariavel;

public class NomeArgs {
	private LinkedList<ParamFormais> paramFormais;
	private LinkedList<String> identificador;

	public NomeArgs(String identificar, LinkedList<ParamFormais> paramFormais) {
		this.paramFormais = paramFormais;
		this.identificador.addFirst( identificar);
	}
	
	public void addLast(String identificador, LinkedList<ParamFormais> dv)
	{
		this.identificador.addLast(identificador);
		paramFormais.addAll(dv);
		
	}

	public Boolean verificarSemantica() {
		
		SymbolTable.getInstance().pushVariable();
		

		SymbolTable.getInstance().popVariable();
		return null;
	}

	public String gerarCodigoIntermediario(String filename) {
		return null;
	}
}
