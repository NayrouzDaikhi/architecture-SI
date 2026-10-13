package tn.esprit.atelier1.Service;

import tn.esprit.atelier1.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    void supprimerEquipement(Long id);
    List<Equipement> afficherEquipements();
    Equipement modifierEquipement(Equipement equipement);
    Equipement AfficherEquipementByID(Long id);
}
