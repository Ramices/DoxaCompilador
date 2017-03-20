package compiler.tree.command;

import java.util.ArrayList;
import java.util.List;

import compiler.tree.Tipo;


public class Bloco implements Comando {
	private List<Comando> comandos;

	public Bloco() {
		this.comandos = new ArrayList<Comando>();
	}

	public Bloco(List<Comando> comandos) {
		this.comandos = comandos;
	}

	public void add(Comando cmd) {
		this.comandos.add(cmd);
	}

	@Override
	public Boolean verificarSemantica() {
		
		for(int i  = 0; i < comandos.size(); ++i)
		{
			if(!(comandos.get(i).verificarSemantica()))
				return false;
		}
		
		return true;
	}

	@Override
	public String gerarCodigoIntermediario(String filename) {
		return null;
	}
}
