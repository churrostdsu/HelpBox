package br.com.fiap.helpbox.beans;

public class Objeto {
	
	private int codigoObjeto;
	private String nome;
	private String descricao;
	private int quantidade;
	private String estado;
	private String cor;
	private String genero;	
	
	
	
	public Objeto() {
		super();
	}
	
	public Objeto(int codigoObjeto, String nome, String descricao,
			int quantidade, String estado, String cor, String genero) {
		super();
		this.codigoObjeto = codigoObjeto;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estado = estado;
		this.cor = cor;
		this.genero = genero;
	}


	public int getCodigoObjeto() {
		return codigoObjeto;
	}
	public void setCodigoObjeto(int codigoObjeto) {
		this.codigoObjeto = codigoObjeto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
