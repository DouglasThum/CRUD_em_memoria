/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO{
    
    private Set<Cliente> set;
	
    public ClienteSetDAO() {
            this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
            set.add(cliente);
            return true;
    }

    @Override
    public void excluir(Long cpf) {

            for (Cliente c : set) {
                    if (c.getCpf() == cpf) {
                            set.remove(c);
                    }
            }
    }

    @Override
    public void alterar(Cliente cliente) {

            for (Cliente c : set) {
                    if (c.getCpf() == cliente.getCpf()) {
                            c.setNome(cliente.getNome());
                            c.setRua(cliente.getRua());
                            c.setNumero(cliente.getNumero());
                            c.setCidade(cliente.getCidade());
                            c.setEstado(cliente.getEstado());
                    }
            }

    }

    @Override
    public Cliente consultar(Long cpf) {
            for (Cliente c : set) {
                    if (c.getCpf() == cpf) {
                            return c;
                    }
            }
            return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
 
}
