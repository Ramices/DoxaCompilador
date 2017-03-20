package compiler.table;

import java.util.HashMap;
import java.util.Stack;

public class SymbolTable 
{
	private Stack <HashMap<String, String>> variaveis;
	private static SymbolTable instance;
	
	public SymbolTable()
	{
		variaveis = new Stack<HashMap<String, String>>();
		
	}
	
	public static  SymbolTable getInstance()
	{
		if(instance == null)
			instance = new SymbolTable();
		
		return instance;
	}
	
	public void pushVariable()
	{
		variaveis.push(new HashMap<String, String>() );
	}
	
	public void popVariable()
	{
		variaveis.pop();
	}

	public void putVariable(String nome, String tipo) throws Exception
	{
		
		if(!variaveis.lastElement().containsKey(nome))
		 variaveis.lastElement().put(nome, tipo);
		else
			throw new Exception("Variavel ja existe");
	}
	
	public HashMap<String, String> getVariable(String key)
	{
		for(int i = variaveis.size()-1; i >=0; --i)
		{
			if(variaveis.get(i).containsKey(key))
				return variaveis.get(i);
		}
		
		return null;
		
	}
	

	
}

