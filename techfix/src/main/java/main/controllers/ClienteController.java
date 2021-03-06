package main.controllers;

import main.model.Cliente;
import main.model.Endereco;
import main.model.Equipamento;
import main.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente, Endereco endereco, Equipamento equipamento) throws URISyntaxException{
        clienteService.salvar(cliente, endereco, equipamento);
        return ResponseEntity.created(new URI("http://localhost:8081/cliente/" + cliente.getNome())).build();
    }

    @PatchMapping("/change")
    public ResponseEntity<Cliente> atualizar(@RequestBody Cliente cliente, Endereco endereco, Equipamento equipamento) throws URISyntaxException{
        clienteService.salvar(cliente, endereco, equipamento);
        return ResponseEntity.created(new URI("http://localhost:8081/cliente/" + cliente.getNome())).build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Cliente>> consultarTodos(){
        return ResponseEntity.ok().body(clienteService.findAll());
    }

    @GetMapping("/find/{cliente}")
    public ResponseEntity<Cliente> consultar(@PathVariable("cliente") Cliente cliente){
        if (cliente != null){
            return ResponseEntity.ok().body(clienteService.find(cliente));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{cliente}")
    public ResponseEntity<Void> delete(@PathVariable("cliente") Cliente cliente){
        if (cliente != null){
            clienteService.deletar(cliente);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
