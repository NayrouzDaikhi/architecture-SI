package tn.esprit.atelier1.Service;
import tn.esprit.atelier1.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat ajouterContrat (Contrat Contrat);
    void supprimerContrat (Long id) ;
    List<Contrat> afficherContrats ();
    Contrat modifierContrat (Contrat Contrat);
    Contrat AfficherContratByID (Long id);
}
