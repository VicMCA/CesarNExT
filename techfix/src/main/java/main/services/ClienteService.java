package main.services;

import main.DAO.ClienteDAO;
import main.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    public void salvar(Cliente cliente){
        clienteDAO.save(cliente);
    }

    public void remover(Cliente cliente){
        clienteDAO.delete(cliente);
    }

    public List<Cliente> findAll(){
        return clienteDAO.findAll();
    }

    public Cliente find(long id){
        return clienteDAO.findById(id).get();
    }
}
