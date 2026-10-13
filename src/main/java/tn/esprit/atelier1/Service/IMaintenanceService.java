package tn.esprit.atelier1.Service;

import tn.esprit.atelier1.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    void supprimerMaintenance(Long id);
    List<Maintenance> afficherMaintenances();
    Maintenance modifierMaintenance(Maintenance maintenance);
    Maintenance AfficherMaintenanceByID(Long id);
}
