package tn.esprit.atelier1.Contollers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.atelier1.Service.IContratService;
import tn.esprit.atelier1.entities.Contrat;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Contrats")
public class ContratController {

    private IContratService contratService;

    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @PutMapping("/modifierContrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @DeleteMapping("/supprimerContrat/{id}")
    public void supprimerContrat(@PathVariable Long id) {
        contratService.supprimerContrat(id);
    }

    @GetMapping("/getContrat/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return contratService.AfficherContratByID(id);
    }

    @GetMapping("/allContrats")
    public List<Contrat> afficherContrats() {
        return contratService.afficherContrats();
    }
}
