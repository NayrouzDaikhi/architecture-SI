package tn.esprit.atelier1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.entities.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}
