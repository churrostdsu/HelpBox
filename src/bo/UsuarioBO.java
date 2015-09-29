package br.com.fiap.helpbox.bo;

import java.util.List;

import br.com.fiap.helpbox.beans.Usuario;
import br.com.fiap.helpbox.dao.UsuarioDAO;

public class UsuarioBO {
	
		// CRUD + List

	// CRUD (Create)
	public void novoUsuario(Usuario u) throws Exception{
//		if(u.getDtNascimento()>){
//			throw new Excecao(
//		}
		new UsuarioDAO().addUsuario(u);
	}
	
	// CRUD (Read)
	public Usuario consultarUsuario(String u) throws Exception{
		return new UsuarioDAO().pesquisarUsuario(u.toUpperCase());
	}
	
	// CRUD (Update)
	public int alterarSenha(String u) throws Exception{
		return new UsuarioDAO().atualizarSenha(u);
	}
	
	// CRUD (Delete)
	public int excluirUsuario(String u) throws Exception{
		return new UsuarioDAO().deletarUsuario(u);
	}
	
	// List
	public List<Usuario> listarUsuarios() throws Exception{
		return new UsuarioDAO().listUsuario();
	}
		
}
