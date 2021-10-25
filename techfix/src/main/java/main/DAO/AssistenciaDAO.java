package main.DAO;

import main.model.Assistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssistenciaDAO extends JpaRepository<Assistencia, Long> {
}
