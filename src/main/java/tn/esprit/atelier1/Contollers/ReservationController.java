package tn.esprit.atelier1.Contollers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.atelier1.Service.IReservationService;
import tn.esprit.atelier1.entities.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservations")
public class ReservationController {

    private IReservationService reservationService;

    @PostMapping("/ajouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.ajouterReservation(reservation);
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.modifierReservation(reservation);
    }

    @DeleteMapping("/supprimerReservation/{id}")
    public void supprimerReservation(@PathVariable Long id) {
        reservationService.supprimerReservation(id);
    }

    @GetMapping("/getReservation/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return reservationService.AfficherReservationByID(id);
    }

    @GetMapping("/allReservations")
    public List<Reservation> afficherReservations() {
        return reservationService.afficherReservations();
    }
}
