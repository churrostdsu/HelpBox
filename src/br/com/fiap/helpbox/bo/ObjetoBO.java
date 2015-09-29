package br.com.fiap.helpbox.bo;

import java.util.List;

import br.com.fiap.helpbox.beans.Objeto;
import br.com.fiap.helpbox.dao.ObjetoDAO;

public class ObjetoBO {

		// CRUD + List

	// CRUD (Create)
	public void novoObjeto(Objeto o) throws Exception{
// pessoa precisa estar cadastrada
		new ObjetoDAO().addObjeto(o);     
	}

	// CRUD (Read)
	public Objeto consultarObjeto(String o) throws Exception{
		return new ObjetoDAO().pesquisarObjeto(o.toUpperCase());
	}

	// CRUD (Update)
	public int (String o) throws Exception{
		return new ObjetoDAO().
	}

	// CRUD (Delete)
	public int excluirObjeto(String o) throws Exception{
		return new ObjetoDAO().deletarObjeto(o);
	}

	// List
	public List<Objeto> listarObjetos() throws Exception{
		return new ObjetoDAO().listObjeto();
	}

}
