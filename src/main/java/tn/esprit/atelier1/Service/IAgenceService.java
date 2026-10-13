package tn.esprit.atelier1.Service;

import tn.esprit.atelier1.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence (Agence agence);
    void supprimerAgence (Long id) ;
    List<Agence> afficherAgences ();
    Agence modifierAgence (Agence agence);
    Agence AfficherAgenceByID (Long id);
}
