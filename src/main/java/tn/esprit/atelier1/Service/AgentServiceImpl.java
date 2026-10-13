package tn.esprit.atelier1.Service;




import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.entities.Agence;
import tn.esprit.atelier1.repositories.AgenceRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class AgentServiceImpl implements IAgenceService{
    private AgenceRepository agenceRepository ;
    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void supprimerAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> afficherAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence AfficherAgenceByID(Long id) {
        return  agenceRepository.findById(id).orElse(null);
    }
}

