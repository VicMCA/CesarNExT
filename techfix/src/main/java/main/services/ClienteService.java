package main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import main.DAO.ClienteDAO;
import main.DAO.EnderecoDAO;
import main.DAO.EquipamentoDAO;
import main.dto.CustomerResponseDTO;
import main.exceptions.CustomerNotFoundException;
import main.model.Cliente;
import main.model.Endereco;
import main.model.Equipamento;

@Service
@RequiredArgsConstructor
public class ClienteService {

	private final ClienteDAO clienteDAO;

	private final EnderecoDAO enderecoDAO;

	private final EquipamentoDAO equipamentoDAO;

	public void salvar(Cliente cliente, Endereco endereco, Equipamento equipamento) {
		enderecoDAO.save(endereco);
		equipamentoDAO.save(equipamento);
		clienteDAO.save(cliente);
	}

	public void deletar(Cliente cliente) {
		clienteDAO.delete(cliente);
	}

	public List<Cliente> findAll() {
		return clienteDAO.findAll();
	}

	public Cliente find(Cliente cliente) {
		return clienteDAO.findById(cliente.getId()).get();
	}

	public CustomerResponseDTO findById(Long id) throws CustomerNotFoundException {
		Cliente cliente = this.clienteDAO.findById(id).orElseThrow(CustomerNotFoundException::new);

		return CustomerResponseDTO.deserialize(cliente);
	}
}
