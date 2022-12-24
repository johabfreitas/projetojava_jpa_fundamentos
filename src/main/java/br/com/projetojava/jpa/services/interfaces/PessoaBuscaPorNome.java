package br.com.projetojava.jpa.services.interfaces;

import java.util.List;

import br.com.projetojava.jpa.models.Pessoa;

public interface PessoaBuscaPorNome  extends CrudService<Pessoa, Integer>{
	
	public List<Pessoa> searchByName(String name);
}
