package tn.esprit.atelier1.Service;
import tn.esprit.atelier1.entities.Employee;
import java.util.List;

public interface IEmployeService {
    Employee ajouterEmploye (Employee Employee);
    void supprimerEmploye (Long id) ;
    List<Employee> afficherEmployes ();
    Employee modifierEmploye (Employee Employee);
    Employee AfficherEmployeByID (Long id);
}
