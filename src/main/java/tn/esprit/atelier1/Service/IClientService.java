package tn.esprit.atelier1.Service;
import tn.esprit.atelier1.entities.Client;
import java.util.List;

public interface IClientService {
    Client ajouterClient (Client client);
    void supprimerClient (Long id) ;
    List<Client> afficherClients ();
    Client modifierClient (Client client);
    Client AfficherClientByID (Long id);
}
