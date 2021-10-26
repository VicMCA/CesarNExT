package main.DAO;

import main.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoDAO extends JpaRepository<Endereco, Long> {

}