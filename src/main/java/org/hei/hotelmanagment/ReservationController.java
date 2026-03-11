package org.hei.hotelmanagment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ReservationController {
    @GetMapping("/booking")
    public List<ReservationModel> getReservation(){
        return ReservationList.reservationLists;
    }
    @PostMapping("/booking")
    public List<ReservationModel> createReservation(
            @RequestParam String customer_name,
            @RequestParam String customer_phone_number,
            @RequestParam String customer_mail_adress,
            @RequestParam int room_number,
            @RequestParam String room_description,
            @RequestParam LocalDateTime reservation_date
    ) {
        if (room_number < 1 || room_number > 9) {
            System.out.println("Erreur : le numéro de chambre doit être compris entre 1 et 9");
            return ReservationList.reservationLists;
        }

        ReservationModel newReservation = new ReservationModel(
                customer_mail_adress,
                customer_name,
                customer_phone_number,
                reservation_date,
                room_description,
                room_number
        );

        ReservationList.reservationLists.add(newReservation);

        return ReservationList.reservationLists;
    }
    @PostMapping("/booking/check")
    public List<ReservationModel> createReservationWithChecking(
            @RequestParam String customer_name,
            @RequestParam String customer_phone_number,
            @RequestParam String customer_mail_adress,
            @RequestParam int room_number,
            @RequestParam String room_description,
            @RequestParam LocalDateTime reservation_date
    ) {
        if (room_number < 1 || room_number > 9) {
            System.out.println("Erreur : le numéro de chambre doit être compris entre 1 et 9");
            return ReservationList.reservationLists;
        }
        for (ReservationModel existingReservation : ReservationList.reservationLists) {
            if (existingReservation.getRoom_number() == room_number &&
                    existingReservation.getReservation_date().equals(reservation_date)) {

                System.out.println("La chambre " + room_number + " est déjà réservée pour la date " + reservation_date);
                return ReservationList.reservationLists;
            }
        }

        ReservationModel newReservation = new ReservationModel(
                customer_mail_adress,
                customer_name,
                customer_phone_number,
                reservation_date,
                room_description,
                room_number
        );

        ReservationList.reservationLists.add(newReservation);

        return ReservationList.reservationLists;
    }

}
