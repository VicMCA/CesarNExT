package main.controllers;

import main.model.Agendamento;
import main.services.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
    @Autowired
    AgendamentoService agendamentoService;

    @PostMapping("/salvar")
    public ResponseEntity<Void>salva(@RequestBody Agendamento agendamento) throws URISyntaxException{
        agendamentoService.salvar(agendamento);
        return ResponseEntity.created(new URI("/"+agendamento.getId())).build();
    }
    @PostMapping("/atualizar")
    public ResponseEntity<Void>atualiza(@RequestBody Agendamento agendamento) throws URISyntaxException{
        agendamentoService.salvar(agendamento);
        return ResponseEntity.created(new URI("http://localhost:8081/agendamento/"+agendamento.getId())).build();
    }

    @GetMapping("/buscar/{agendamento}")
    public ResponseEntity<Agendamento> buscar(@PathVariable("agendamento")Agendamento agendamento) {
        if (agendamento != null){
            return ResponseEntity.ok().body(agendamentoService.find(agendamento));
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/buscarTodos")
    public ResponseEntity<List<Agendamento>> buscarTodos(){
        return ResponseEntity.ok().body(agendamentoService.findAll());
    }

    @PostMapping("/delete/{agendamento}")
    public ResponseEntity<Void>remove(@PathVariable("agendamento") Agendamento agendamento){
        if (agendamento != null) {
            agendamentoService.remover(agendamento);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
