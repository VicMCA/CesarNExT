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

    @PostMapping("/")
    public ResponseEntity<Void>salva(@RequestBody Agendamento agendamento) throws URISyntaxException{
        agendamentoService.salvar(agendamento);
        return ResponseEntity.created(new URI("/"+agendamento.getId())).build();
    }
    @PostMapping("/")
    public ResponseEntity<Void>atualiza(@RequestBody Agendamento agendamentoOld, Agendamento agendamentoNew) throws URISyntaxException{
        agendamentoService.atualizar(agendamentoOld,agendamentoNew);
        return ResponseEntity.created(new URI("/"+agendamentoNew.getId())).build();
    }
    //confirmar, tenho dúvidas de como passar o ID do Agendamento que desejo retirar
    @PostMapping("/")
    public ResponseEntity<Void>remove(@RequestBody Agendamento agendamento) throws URISyntaxException{
        agendamentoService.remover(agendamento);
        return (ResponseEntity<Void>) ResponseEntity.ok();
    }
    @GetMapping("/all")
    public ResponseEntity<List<Agendamento>> buscar() {
        List<Agendamento> agendamentos = agendamentoService.buscar();
        return ResponseEntity.ok().body(agendamentos);
    }
    //falta método para uma busca específica
}
