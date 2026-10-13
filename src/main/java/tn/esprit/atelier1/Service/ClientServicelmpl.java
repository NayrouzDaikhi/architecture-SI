package tn.esprit.atelier1.Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.atelier1.entities.Client;
import tn.esprit.atelier1.repositories.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServicelmpl implements IClientService {
    private ClientRepository clientRepository ;
    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void supprimerClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> afficherClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client AfficherClientByID(Long id) {
        return  clientRepository.findById(id).orElse(null);
    }
}
