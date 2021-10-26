package main.DAO;

import main.model.CategoriaEquip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaEquipDAO extends JpaRepository<CategoriaEquip, Long> {
    
}