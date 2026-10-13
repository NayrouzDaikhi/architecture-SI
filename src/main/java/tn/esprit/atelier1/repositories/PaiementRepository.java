package tn.esprit.atelier1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
