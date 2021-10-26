package main.services;

import main.DAO.ClienteDAO;
import main.DAO.EnderecoDAO;
import main.DAO.EquipamentoDAO;
import main.model.Cliente;
import main.model.Endereco;
import main.model.Equipamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private ClienteDAO clienteDAO;
    private EnderecoDAO enderecoDAO;
    private EquipamentoDAO equipamentoDAO;

    @Autowired
    public ClienteService(ClienteDAO clienteDAO, EnderecoDAO enderecoDAO, EquipamentoDAO equipamentoDAO){
        this.clienteDAO = clienteDAO;
        this.enderecoDAO = enderecoDAO;
        this.equipamentoDAO = equipamentoDAO;
    }

        public void salvar(Cliente cliente, Endereco endereco, Equipamento equipamento){
        enderecoDAO.save(endereco);
        equipamentoDAO.save(equipamento);
        clienteDAO.save(cliente);
    }

    public void deletar(Cliente cliente){
        clienteDAO.delete(cliente);
    }

    public List<Cliente> findAll(){
        return clienteDAO.findAll();
    }

    public Cliente find(Cliente cliente){
        return clienteDAO.findById(cliente.getId()).get();
    }
}
