package tn.esprit.atelier1.Service;

import tn.esprit.atelier1.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    void supprimerVehicule(Long id);
    List<Vehicule> afficherVehicules();
    Vehicule modifierVehicule(Vehicule vehicule);
    Vehicule AfficherVehiculeByID(Long id);
}
