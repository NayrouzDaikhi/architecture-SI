package tn.esprit.atelier1.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.entities.Employee;
import tn.esprit.atelier1.repositories.EmployeeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServicelmpl implements IEmployeService {
    private EmployeeRepository EmployeRepository ;
    @Override
    public Employee ajouterEmploye(Employee Employee) {
        return EmployeRepository.save(Employee);
    }

    @Override
    public void supprimerEmploye(Long id) {
        EmployeRepository.deleteById(id);
    }

    @Override
    public List<Employee> afficherEmployes() {
        return EmployeRepository.findAll();
    }

    @Override
    public Employee modifierEmploye(Employee Employee) {
        return EmployeRepository.save(Employee);
    }

    @Override
    public Employee AfficherEmployeByID(Long id) {
        return  EmployeRepository.findById(id).orElse(null);
    }
}
