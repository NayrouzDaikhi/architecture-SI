package tn.esprit.atelier1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.entities.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
