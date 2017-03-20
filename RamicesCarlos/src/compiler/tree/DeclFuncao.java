package compiler.tree;

import compiler.table.SymbolTable;
import compiler.tree.command.Bloco;

public class DeclFuncao implements DeclGlobal {
	private NomeArgs nomesParams;
	private Bloco bloco;
	private Tipo tipo;
	
	public DeclFuncao(NomeArgs assinatura, Bloco bloco) {
		this.nomesParams = assinatura;
		this.bloco = bloco;
	}
        	
        public DeclFuncao(NomeArgs assinatura, Bloco bloco, Tipo tipo) {
		this.nomesParams = assinatura;
		this.bloco = bloco;
                this.tipo = tipo;
	}


	@Override
	public Boolean verificarSemantica() 
	{

		SymbolTable.getInstance().pushVariable();
		
		if(!(nomesParams.verificarSemantica()) || !(bloco.verificarSemantica()))
				return false;
		
		SymbolTable.getInstance().popVariable();
		return true;
	}

	@Override
	public String gerarCodigoIntermediario(String filename) {
		return null;
	}

}
