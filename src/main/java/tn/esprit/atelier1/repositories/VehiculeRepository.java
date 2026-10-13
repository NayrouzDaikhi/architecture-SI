package tn.esprit.atelier1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier1.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}
