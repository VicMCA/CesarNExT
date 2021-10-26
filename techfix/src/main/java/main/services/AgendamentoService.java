package main.services;

import main.DAO.AgendamentoDAO;
import main.model.Agendamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {
    @Autowired
    AgendamentoDAO agendamentoDAO;

    public void salvar(Agendamento agendamento){
        agendamentoDAO.save(agendamento);
    }

    public void remover(Agendamento agendamento){
        agendamentoDAO.delete(agendamento);
    }

    public List<Agendamento> findAll(){
        return agendamentoDAO.findAll();
    }

    public Agendamento find(Agendamento agendamento){
        return agendamentoDAO.findById(agendamento.getId()).get();
    }

}
