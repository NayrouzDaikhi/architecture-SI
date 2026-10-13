package tn.esprit.atelier1.repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.atelier1.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
