package tn.esprit.atelier1.Service;

import tn.esprit.atelier1.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    void supprimerReservation(Long id);
    List<Reservation> afficherReservations();
    Reservation modifierReservation(Reservation reservation);
    Reservation AfficherReservationByID(Long id);
}
