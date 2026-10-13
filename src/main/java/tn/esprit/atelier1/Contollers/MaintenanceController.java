package tn.esprit.atelier1.Contollers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.atelier1.Service.IMaintenanceService;
import tn.esprit.atelier1.entities.Maintenance;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Maintenances")
public class MaintenanceController {

    private IMaintenanceService maintenanceService;

    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.ajouterMaintenance(maintenance);
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.modifierMaintenance(maintenance);
    }

    @DeleteMapping("/supprimerMaintenance/{id}")
    public void supprimerMaintenance(@PathVariable Long id) {
        maintenanceService.supprimerMaintenance(id);
    }

    @GetMapping("/getMaintenance/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceService.AfficherMaintenanceByID(id);
    }

    @GetMapping("/allMaintenances")
    public List<Maintenance> afficherMaintenances() {
        return maintenanceService.afficherMaintenances();
    }
}
