package tn.esprit.atelier1.Contollers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.atelier1.Service.IEquipementService;
import tn.esprit.atelier1.entities.Equipement;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Equipements")
public class EquipementController {

    private IEquipementService equipementService;

    @PostMapping("/ajouterEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.ajouterEquipement(equipement);
    }

    @PutMapping("/modifierEquipement")
    public Equipement modifierEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifierEquipement(equipement);
    }

    @DeleteMapping("/supprimerEquipement/{id}")
    public void supprimerEquipement(@PathVariable Long id) {
        equipementService.supprimerEquipement(id);
    }

    @GetMapping("/getEquipement/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementService.AfficherEquipementByID(id);
    }

    @GetMapping("/allEquipements")
    public List<Equipement> afficherEquipements() {
        return equipementService.afficherEquipements();
    }
}
