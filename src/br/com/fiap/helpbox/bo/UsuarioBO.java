package br.com.fiap.helpbox.bo;

import java.util.List;

import br.com.fiap.helpbox.beans.Usuario;
import br.com.fiap.helpbox.dao.UsuarioDAO;

public class UsuarioBO {
	
	UsuarioDAO ud;
	Usuario ub;
	
		// CRUD + List

	// CRUD (Create)
	public boolean novoUsuario(String nome,String sobrenome,int cpf,String rg,String dataNasc,String endereco,int cep,int telefone,String email,String senha) throws Exception{
		ub= new Usuario(nome,sobrenome,cpf,rg,dataNasc,endereco,cep,telefone,email,senha);
		ud = new UsuarioDAO();
		
		if(ud.addUsuario(nome,sobrenome,cpf,rg,dataNasc,endereco,cep,telefone,email,senha)==true){
			return true;
		}else{
			return false;
		}

		
	}
	
	// CRUD (Read)
	public Usuario consultarUsuario(String u) throws Exception{
		return new UsuarioDAO().pesquisarUsuario(u.toUpperCase());
	}
	
	// CRUD (Update)
	public int alterarUsuario(Usuario u) throws Exception{
		return new UsuarioDAO().atualizarUsuario(u);
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
