package main.DAO;

import main.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoDAO extends JpaRepository<Agendamento, Long> {
}
