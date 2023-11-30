/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Objects;

public class Cliente {
	
	private String nome;
	private Long cpf;
	private Long tel;
	private String rua;
	private Integer numero;
	private String cidade;
	private String estado;
	
	public Cliente() {
	}

	public Cliente(String nome, Long cpf, Long tel, String rua, Integer numero, String cidade, String estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getTel() {
		return tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		return "Cliente: " + nome + " CPF: " + cpf + 
				" Endereço: " + rua + " nº " + numero + " - " + cidade + "/" + estado;
	}
        
        public String enderecoToString() {
            return rua + " nº " + numero + " - " + cidade + "/" + estado;
        }
}
