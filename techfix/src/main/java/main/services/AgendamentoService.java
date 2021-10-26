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
    public void atualizar(Agendamento agendamentoOld,Agendamento agendamentoNew) {
        agendamentoDAO.delete(agendamentoOld);
        agendamentoDAO.save(agendamentoNew);
    }
    public List<Agendamento>buscar(){
        return agendamentoDAO.findAll();
    }


}
