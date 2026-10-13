package tn.esprit.atelier1.Contollers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.atelier1.entities.Agence;
import tn.esprit.atelier1.Service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Agences")
public class AgenceController {
    private IAgenceService agenceSerive;
    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence)

    {
        return agenceSerive.ajouterAgence(agence);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence)

    {
        return agenceSerive.modifierAgence(agence);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void supprimerAgence(@PathVariable Long id)
    {
        agenceSerive.supprimerAgence(id);
    }



    @GetMapping("/getAgence/{id}")
    public Agence AfficherAgenceByID(@PathVariable Long id)
    {
        return agenceSerive.AfficherAgenceByID(id);
    }



    @GetMapping("/allAgences")
    public List<Agence> afficherAgences() {
        return agenceSerive.afficherAgences();
    }
}
