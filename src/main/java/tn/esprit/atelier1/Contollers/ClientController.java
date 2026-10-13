package tn.esprit.atelier1.Contollers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.atelier1.Service.IClientService;
import tn.esprit.atelier1.entities.Client;
import tn.esprit.atelier1.entities.Client;
import tn.esprit.atelier1.Service.IClientService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/Clients")

public class ClientController {
    private IClientService ClientSerive;
    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client Client)

    {
        return ClientSerive.ajouterClient(Client);
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client Client)

    {
        return ClientSerive.modifierClient(Client);
    }

    @DeleteMapping("/supprimerClient/{id}")
    public void supprimerClient(@PathVariable Long id)
    {
        ClientSerive.supprimerClient(id);
    }



    @GetMapping("/getClient/{id}")
    public Client AfficherClientByID(@PathVariable Long id)
    {
        return ClientSerive.AfficherClientByID(id);
    }



    @GetMapping("/allClients")
    public List<Client> afficherClients() {
        return ClientSerive.afficherClients();
    }
}
