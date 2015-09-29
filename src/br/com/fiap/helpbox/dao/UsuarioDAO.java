package br.com.fiap.helpbox.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.helpbox.beans.Usuario;
import br.com.fiap.helpbox.conexao.ConexaoFactory;

public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() throws Exception{
		this.conexao = new ConexaoFactory().getConnection();
	}


		// CRUD + List

	// CRUD (Create)
	public void addUsuario(Usuario u) throws Exception{
		String sql = "insert into T_HB_USUARIO " + "(cd_usuario, nm_usuario, nm_sobrenome, nr_cpf, nr_rg, dt_nascimento, ds_endereco, nr_cep, nr_telefone, ds_email, ds_senha) values (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement estrutura = conexao.prepareStatement(sql);
		estrutura.setInt(1, u.getCodigoUsuario());
		estrutura.setString(2, u.getNome());
		estrutura.setString(3, u.getSobrenome());
		estrutura.setString(4, u.getRg());
		estrutura.setInt(5, u.getCpf());
		estrutura.setString(6, u.getDtNascimento());
		estrutura.setString(7, u.getEndereco());
		estrutura.setInt(8, u.getCep());
		estrutura.setInt(9, u.getTelefone());
		estrutura.setString(10, u.getEmail());
		estrutura.setString(11, u.getSenha());
		estrutura.execute();
		estrutura.close();
	}

	// CRUD (Read)
	public Usuario pesquisarUsuario(String strUsuario) throws Exception{
		Usuario usuario = new Usuario();
		PreparedStatement estrutura = this.conexao.prepareStatement("select * from T_HB_USUARIO");
		estrutura.setString(1, strUsuario);
		ResultSet resultadoDados = estrutura.executeQuery();
		if(resultadoDados.next()){
			usuario.setCodigoUsuario(resultadoDados.getInt("cd_usuario"));
			usuario.setNome(resultadoDados.getString("nm_usuario"));
			usuario.setSobrenome(resultadoDados.getString("nm_sobrenome"));
			usuario.setCpf(resultadoDados.getInt("nr_cpf"));
			usuario.setRg(resultadoDados.getString("nr_rg"));
			usuario.setDtNascimento(resultadoDados.getString("dt_nascimento"));
			usuario.setEndereco(resultadoDados.getString("ds_endereco"));
			usuario.setCep(resultadoDados.getInt("nr_cep"));
			usuario.setTelefone(resultadoDados.getInt("nr_telefone"));
			usuario.setEmail(resultadoDados.getString("ds_email"));
			usuario.setSenha(resultadoDados.getString("ds_senha"));
		}
		resultadoDados.close();
		estrutura.close();
		return usuario;
	}

	// CRUD (Update)
	public int atualizarUsuario(Usuario usuario) throws Exception{
		PreparedStatement stmt = conexao.prepareStatement("update T_HB_USUARIO set nm_usuario=?, nm_sobrenome=?, nr_cpf=?, nr_rg=?, dt_nascimento=?, ds_endereco=?, nr_cep=?, nr_telefone=?, ds_email=?, ds_senha=? where cd_usuario=?");
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getSobrenome());
		stmt.setInt(3, usuario.getCpf());
		stmt.setString(4, usuario.getRg());
		stmt.setString(5, usuario.getNome());
		stmt.setString(6, usuario.getSobrenome());
		stmt.setString(7, usuario.getNome());
		stmt.setString(8, usuario.getSobrenome());
		stmt.setString(9, usuario.getNome());
		stmt.setString(10, usuario.getSobrenome());
		int saida = stmt.executeUpdate();
		stmt.close();
		return saida;
	}

	// CRUD (Delete)
	public int deletarUsuario(String x) throws Exception{
		PreparedStatement stmt = conexao.prepareStatement("delete from T_HB_USUARIO where cd_usuario=?");
		stmt.setString(1, x);
		int saida = stmt.executeUpdate();
		stmt.close();
		return saida;
	}

	// List
	public List<Usuario> listUsuario() throws Exception{
		List<Usuario> lstUsuarios = new ArrayList<Usuario>();
		PreparedStatement estrutura = this.conexao.prepareStatement("select * from T_HB_USUARIO");
		ResultSet resultadoDados = estrutura.executeQuery();
		while(resultadoDados.next()){
			Usuario usuario = new Usuario();
			usuario.setCodigoUsuario(resultadoDados.getInt("cd_usuario"));
			usuario.setNome(resultadoDados.getString("nm_usuario"));
			usuario.setSobrenome(resultadoDados.getString("nm_sobrenome"));
			usuario.setCpf(resultadoDados.getInt("nr_cpf"));
			usuario.setRg(resultadoDados.getString("nr_rg"));
			usuario.setDtNascimento(resultadoDados.getString("dt_nascimento"));
			usuario.setEndereco(resultadoDados.getString("ds_endereco"));
			usuario.setCep(resultadoDados.getInt("nr_cep"));
			usuario.setTelefone(resultadoDados.getInt("nr_telefone"));
			usuario.setEmail(resultadoDados.getString("ds_email"));
			usuario.setSenha(resultadoDados.getString("ds_senha"));
		}
		resultadoDados.close();
		estrutura.close();
		return lstUsuarios;
	}

}
