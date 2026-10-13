package tn.esprit.atelier1.Service;

import tn.esprit.atelier1.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    void supprimerPaiement(Long id);
    List<Paiement> afficherPaiements();
    Paiement modifierPaiement(Paiement paiement);
    Paiement AfficherPaiementByID(Long id);
}
