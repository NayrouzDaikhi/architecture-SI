package tn.esprit.atelier1.Contollers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.atelier1.Service.IVehiculeService;
import tn.esprit.atelier1.entities.Vehicule;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Vehicules")
public class VehiculeController {

    private IVehiculeService vehiculeService;

    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }

    @GetMapping("/getVehicule/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.AfficherVehiculeByID(id);
    }

    @GetMapping("/allVehicules")
    public List<Vehicule> afficherVehicules() {
        return vehiculeService.afficherVehicules();
    }
}
