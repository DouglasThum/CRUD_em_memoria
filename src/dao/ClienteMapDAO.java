/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO {
    
    private Map<Long, Cliente> map;
	
    public ClienteMapDAO() {
            this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
            if (this.map.containsKey(cliente.getCpf())) {
                    return false;
            }
            this.map.put(cliente.getCpf(), cliente);
            return true;
    }

    @Override
    public void excluir(Long cpf) {		

            // clienteCadastrado = obj já instanciado no banco de dados, cliente = parametro rececido para delete

            Cliente clienteCadastrado = this.map.get(cpf);

            if (clienteCadastrado != null) {
                    this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
            }
    }

    @Override
    public void alterar(Cliente cliente) {

            // clienteCadastrado = obj já instanciado no banco de dados, cliente = parametro rececido para update

            Cliente clienteCadastrado = this.map.get(cliente.getCpf());

            if (clienteCadastrado != null) {
                    clienteCadastrado.setNome(cliente.getNome());
                    clienteCadastrado.setTel(cliente.getTel());
                    clienteCadastrado.setRua(cliente.getRua());
                    clienteCadastrado.setNumero(cliente.getNumero());
                    clienteCadastrado.setCidade(cliente.getCidade());
                    clienteCadastrado.setEstado(cliente.getEstado());
            }
    }

    @Override
    public Cliente consultar(Long cpf) {
            return this.map.get(cpf);
    }   

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
