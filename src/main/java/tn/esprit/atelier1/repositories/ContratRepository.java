package tn.esprit.atelier1.repositories;
import tn.esprit.atelier1.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.atelier1.entities.Contrat;

@Repository

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
