package tn.esprit.atelier1.Contollers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.atelier1.Service.IEmployeService;
import tn.esprit.atelier1.entities.Employee;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Employes")
public class EmployeeController {

    private IEmployeService employeService;

    @PostMapping("/ajouterEmploye")
    public Employee ajouterEmploye(@RequestBody Employee employee) {
        return employeService.ajouterEmploye(employee);
    }

    @PutMapping("/modifierEmploye")
    public Employee modifierEmploye(@RequestBody Employee employee) {
        return employeService.modifierEmploye(employee);
    }

    @DeleteMapping("/supprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable Long id) {
        employeService.supprimerEmploye(id);
    }

    @GetMapping("/getEmploye/{id}")
    public Employee getEmployeById(@PathVariable Long id) {
        return employeService.AfficherEmployeByID(id);
    }

    @GetMapping("/allEmployes")
    public List<Employee> afficherEmployes() {
        return employeService.afficherEmployes();
    }
}
