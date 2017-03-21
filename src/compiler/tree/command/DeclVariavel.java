package compiler.tree.command;

import java.util.HashMap;
import java.util.LinkedList;

import compiler.table.SymbolTable;
import compiler.tree.DeclGlobal;
import compiler.tree.Tipo;

public class DeclVariavel implements Comando, DeclGlobal {
	private LinkedList<String> idents;
	private Tipo tipo;

	public DeclVariavel() {
		this.idents = new LinkedList<String>();
	}

	public DeclVariavel(LinkedList<String> ids, Tipo tipo) {
		this.idents = ids;
		this.tipo = tipo;
	}

	public DeclVariavel(String id, Tipo tipo) {
		this.idents = new LinkedList<String>();
		idents.addLast(id);
		this.tipo = tipo;
	}
	
	public LinkedList<String> getIdents() {
		return idents;
	}

	@Override
	public Boolean verificarSemantica()
	{
		SymbolTable.getInstance().pushVariable();
		
		HashMap<String, String> aux = new HashMap<String, String>();
		
		for(int i = 0; i < idents.size(); ++i)
		{
			if(SymbolTable.getInstance().getVariable( idents.get(i)) == null)
			{
				try 
				{
				  SymbolTable.getInstance().putVariable( idents.get(i), tipo.toString());
				
				}
				catch (Exception e)
				{
					SymbolTable.getInstance().popVariable();
					return false;
				}
			}		
		}

		SymbolTable.getInstance().popVariable();
		return true;
	}

	@Override
	public String gerarCodigoIntermediario(String filename) {
		return null;
	}

}
