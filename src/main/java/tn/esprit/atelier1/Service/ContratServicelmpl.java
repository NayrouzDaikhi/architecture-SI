package tn.esprit.atelier1.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.entities.Contrat;
import tn.esprit.atelier1.repositories.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServicelmpl implements IContratService {
    private ContratRepository ContratRepository ;
    @Override
    public Contrat ajouterContrat(Contrat Contrat) {
        return ContratRepository.save(Contrat);
    }

    @Override
    public void supprimerContrat(Long id) {
        ContratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> afficherContrats() {
        return ContratRepository.findAll();
    }

    @Override
    public Contrat modifierContrat(Contrat Contrat) {
        return ContratRepository.save(Contrat);
    }

    @Override
    public Contrat AfficherContratByID(Long id) {
        return  ContratRepository.findById(id).orElse(null);
    }
}
