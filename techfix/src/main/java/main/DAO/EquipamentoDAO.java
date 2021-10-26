package main.DAO;

import main.model.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentoDAO extends JpaRepository<Equipamento, Long> {

}
